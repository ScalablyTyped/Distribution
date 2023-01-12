package typings.ipfsRepoMigrations

import typings.interfaceBlockstore.mod.Blockstore
import typings.interfaceDatastore.mod.Datastore
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcTypesMod {
  
  trait Backends extends StObject {
    
    var blocks: Blockstore
    
    var datastore: Datastore
    
    var keys: Datastore
    
    var pins: Datastore
    
    var root: Datastore
  }
  object Backends {
    
    inline def apply(blocks: Blockstore, datastore: Datastore, keys: Datastore, pins: Datastore, root: Datastore): Backends = {
      val __obj = js.Dynamic.literal(blocks = blocks.asInstanceOf[js.Any], datastore = datastore.asInstanceOf[js.Any], keys = keys.asInstanceOf[js.Any], pins = pins.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
      __obj.asInstanceOf[Backends]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Backends] (val x: Self) extends AnyVal {
      
      inline def setBlocks(value: Blockstore): Self = StObject.set(x, "blocks", value.asInstanceOf[js.Any])
      
      inline def setDatastore(value: Datastore): Self = StObject.set(x, "datastore", value.asInstanceOf[js.Any])
      
      inline def setKeys(value: Datastore): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
      
      inline def setPins(value: Datastore): Self = StObject.set(x, "pins", value.asInstanceOf[js.Any])
      
      inline def setRoot(value: Datastore): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    }
  }
  
  trait LockCloser extends StObject {
    
    def close(): js.Promise[Unit]
  }
  object LockCloser {
    
    inline def apply(close: () => js.Promise[Unit]): LockCloser = {
      val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close))
      __obj.asInstanceOf[LockCloser]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LockCloser] (val x: Self) extends AnyVal {
      
      inline def setClose(value: () => js.Promise[Unit]): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
    }
  }
  
  trait Migration extends StObject {
    
    var description: String
    
    def migrate(backends: Backends, onProgress: MigrationProgressCallback): js.Promise[Unit]
    
    def revert(backends: Backends, onProgress: MigrationProgressCallback): js.Promise[Unit]
    
    var version: Double
  }
  object Migration {
    
    inline def apply(
      description: String,
      migrate: (Backends, MigrationProgressCallback) => js.Promise[Unit],
      revert: (Backends, MigrationProgressCallback) => js.Promise[Unit],
      version: Double
    ): Migration = {
      val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], migrate = js.Any.fromFunction2(migrate), revert = js.Any.fromFunction2(revert), version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[Migration]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Migration] (val x: Self) extends AnyVal {
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setMigrate(value: (Backends, MigrationProgressCallback) => js.Promise[Unit]): Self = StObject.set(x, "migrate", js.Any.fromFunction2(value))
      
      inline def setRevert(value: (Backends, MigrationProgressCallback) => js.Promise[Unit]): Self = StObject.set(x, "revert", js.Any.fromFunction2(value))
      
      inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  trait MigrationOptions extends StObject {
    
    /**
      * Won't lock the repo for applying the migrations. Use with caution.
      */
    var ignoreLock: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Allows to simulate the execution of the migrations without any effect
      */
    var isDryRun: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Array of migrations to perform. If undefined, the bundled migrations are used. Mainly for testing purposes.
      */
    var migrations: js.UndefOr[js.Array[Migration]] = js.undefined
    
    /**
      * Callback which will be called after each executed migration to report progress
      */
    var onProgress: js.UndefOr[ProgressCallback] = js.undefined
  }
  object MigrationOptions {
    
    inline def apply(): MigrationOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MigrationOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MigrationOptions] (val x: Self) extends AnyVal {
      
      inline def setIgnoreLock(value: Boolean): Self = StObject.set(x, "ignoreLock", value.asInstanceOf[js.Any])
      
      inline def setIgnoreLockUndefined: Self = StObject.set(x, "ignoreLock", js.undefined)
      
      inline def setIsDryRun(value: Boolean): Self = StObject.set(x, "isDryRun", value.asInstanceOf[js.Any])
      
      inline def setIsDryRunUndefined: Self = StObject.set(x, "isDryRun", js.undefined)
      
      inline def setMigrations(value: js.Array[Migration]): Self = StObject.set(x, "migrations", value.asInstanceOf[js.Any])
      
      inline def setMigrationsUndefined: Self = StObject.set(x, "migrations", js.undefined)
      
      inline def setMigrationsVarargs(value: Migration*): Self = StObject.set(x, "migrations", js.Array(value*))
      
      inline def setOnProgress(value: (/* version */ Double, /* progress */ String, /* message */ String) => Unit): Self = StObject.set(x, "onProgress", js.Any.fromFunction3(value))
      
      inline def setOnProgressUndefined: Self = StObject.set(x, "onProgress", js.undefined)
    }
  }
  
  type MigrationProgressCallback = js.Function2[/* percent */ Double, /* message */ String, Unit]
  
  type ProgressCallback = js.Function3[/* version */ Double, /* progress */ String, /* message */ String, Unit]
  
  trait RepoLock extends StObject {
    
    /**
      * Sets the lock if one does not already exist. If a lock already exists, should throw an error.
      */
    def lock(path: String): js.Promise[LockCloser]
    
    /**
      * Checks the existence of the lock.
      */
    def locked(path: String): js.Promise[Boolean]
  }
  object RepoLock {
    
    inline def apply(lock: String => js.Promise[LockCloser], locked: String => js.Promise[Boolean]): RepoLock = {
      val __obj = js.Dynamic.literal(lock = js.Any.fromFunction1(lock), locked = js.Any.fromFunction1(locked))
      __obj.asInstanceOf[RepoLock]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RepoLock] (val x: Self) extends AnyVal {
      
      inline def setLock(value: String => js.Promise[LockCloser]): Self = StObject.set(x, "lock", js.Any.fromFunction1(value))
      
      inline def setLocked(value: String => js.Promise[Boolean]): Self = StObject.set(x, "locked", js.Any.fromFunction1(value))
    }
  }
  
  trait RepoOptions extends StObject {
    
    /**
      * Controls automatic migrations of repository. (defaults: true)
      */
    var autoMigrate: Boolean
    
    /**
      * Callback function to be notified of migration progress
      */
    def onMigrationProgress(version: Double, percentComplete: String, message: String): Unit
    
    /**
      * A lock implementation that prevents multiple processes accessing the same repo
      */
    var repoLock: RepoLock
    
    /**
      * If multiple processes are accessing the same repo - e.g. via node cluster or browser UI and webworkers
      * one instance must be designated the repo owner to hold the lock on shared resources like the datastore.
      *
      * Set this property to true on one instance only if this is how your application is set up.
      */
    var repoOwner: Boolean
  }
  object RepoOptions {
    
    inline def apply(
      autoMigrate: Boolean,
      onMigrationProgress: (Double, String, String) => Unit,
      repoLock: RepoLock,
      repoOwner: Boolean
    ): RepoOptions = {
      val __obj = js.Dynamic.literal(autoMigrate = autoMigrate.asInstanceOf[js.Any], onMigrationProgress = js.Any.fromFunction3(onMigrationProgress), repoLock = repoLock.asInstanceOf[js.Any], repoOwner = repoOwner.asInstanceOf[js.Any])
      __obj.asInstanceOf[RepoOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RepoOptions] (val x: Self) extends AnyVal {
      
      inline def setAutoMigrate(value: Boolean): Self = StObject.set(x, "autoMigrate", value.asInstanceOf[js.Any])
      
      inline def setOnMigrationProgress(value: (Double, String, String) => Unit): Self = StObject.set(x, "onMigrationProgress", js.Any.fromFunction3(value))
      
      inline def setRepoLock(value: RepoLock): Self = StObject.set(x, "repoLock", value.asInstanceOf[js.Any])
      
      inline def setRepoOwner(value: Boolean): Self = StObject.set(x, "repoOwner", value.asInstanceOf[js.Any])
    }
  }
}
