package typings.marv

import org.scalablytyped.runtime.TopLevel
import typings.marv.anon.Quiet
import typings.node.fsMod.PathLike
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("marv", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def drop(driver: Driver): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("drop")(driver.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def drop(driver: Driver, cb: ErrorOnlyCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("drop")(driver.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def migrate(migrations: js.Array[ParsedMigration], driver: Driver, cb: ErrorOnlyCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("migrate")(migrations.asInstanceOf[js.Any], driver.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def migrate(migrations: js.Array[ParsedMigration], driver: Driver, options: Quiet, cb: ErrorOnlyCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("migrate")(migrations.asInstanceOf[js.Any], driver.asInstanceOf[js.Any], options.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def scan(
    directory: PathLike,
    cb: js.Function2[/* err */ js.UndefOr[js.Error], /* migrations */ js.Array[ParsedMigration], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("scan")(directory.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def scan(
    directory: PathLike,
    options: ScanOptions,
    cb: js.Function2[/* err */ js.UndefOr[js.Error], /* migrations */ js.Array[ParsedMigration], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("scan")(directory.asInstanceOf[js.Any], options.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait Driver extends StObject {
    
    def connect(cb: ErrorOnlyCallback): Unit
    
    def disconnect(cb: ErrorOnlyCallback): Unit
    
    def dropMigrations(cb: ErrorOnlyCallback): Unit
    
    def ensureMigrations(cb: ErrorOnlyCallback): Unit
    
    def getMigrations(cb: js.Function2[/* error */ js.Error | Null, /* migrations */ js.Array[DriverMigration], Unit]): Unit
    
    def lockMigrations(cb: ErrorOnlyCallback): Unit
    
    def runMigration(migration: ParsedMigration, cb: ErrorOnlyCallback): Unit
    
    def unlockMigrations(cb: ErrorOnlyCallback): Unit
  }
  object Driver {
    
    inline def apply(
      connect: ErrorOnlyCallback => Unit,
      disconnect: ErrorOnlyCallback => Unit,
      dropMigrations: ErrorOnlyCallback => Unit,
      ensureMigrations: ErrorOnlyCallback => Unit,
      getMigrations: js.Function2[/* error */ js.Error | Null, /* migrations */ js.Array[DriverMigration], Unit] => Unit,
      lockMigrations: ErrorOnlyCallback => Unit,
      runMigration: (ParsedMigration, ErrorOnlyCallback) => Unit,
      unlockMigrations: ErrorOnlyCallback => Unit
    ): Driver = {
      val __obj = js.Dynamic.literal(connect = js.Any.fromFunction1(connect), disconnect = js.Any.fromFunction1(disconnect), dropMigrations = js.Any.fromFunction1(dropMigrations), ensureMigrations = js.Any.fromFunction1(ensureMigrations), getMigrations = js.Any.fromFunction1(getMigrations), lockMigrations = js.Any.fromFunction1(lockMigrations), runMigration = js.Any.fromFunction2(runMigration), unlockMigrations = js.Any.fromFunction1(unlockMigrations))
      __obj.asInstanceOf[Driver]
    }
    
    extension [Self <: Driver](x: Self) {
      
      inline def setConnect(value: ErrorOnlyCallback => Unit): Self = StObject.set(x, "connect", js.Any.fromFunction1(value))
      
      inline def setDisconnect(value: ErrorOnlyCallback => Unit): Self = StObject.set(x, "disconnect", js.Any.fromFunction1(value))
      
      inline def setDropMigrations(value: ErrorOnlyCallback => Unit): Self = StObject.set(x, "dropMigrations", js.Any.fromFunction1(value))
      
      inline def setEnsureMigrations(value: ErrorOnlyCallback => Unit): Self = StObject.set(x, "ensureMigrations", js.Any.fromFunction1(value))
      
      inline def setGetMigrations(
        value: js.Function2[/* error */ js.Error | Null, /* migrations */ js.Array[DriverMigration], Unit] => Unit
      ): Self = StObject.set(x, "getMigrations", js.Any.fromFunction1(value))
      
      inline def setLockMigrations(value: ErrorOnlyCallback => Unit): Self = StObject.set(x, "lockMigrations", js.Any.fromFunction1(value))
      
      inline def setRunMigration(value: (ParsedMigration, ErrorOnlyCallback) => Unit): Self = StObject.set(x, "runMigration", js.Any.fromFunction2(value))
      
      inline def setUnlockMigrations(value: ErrorOnlyCallback => Unit): Self = StObject.set(x, "unlockMigrations", js.Any.fromFunction1(value))
    }
  }
  
  trait DriverMigration extends StObject {
    
    var checksum: String | Null
    
    var comment: String | Null
    
    var level: Double
    
    var namespace: String
    
    var timestamp: String | Null
  }
  object DriverMigration {
    
    inline def apply(level: Double, namespace: String): DriverMigration = {
      val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], checksum = null, comment = null, timestamp = null)
      __obj.asInstanceOf[DriverMigration]
    }
    
    extension [Self <: DriverMigration](x: Self) {
      
      inline def setChecksum(value: String): Self = StObject.set(x, "checksum", value.asInstanceOf[js.Any])
      
      inline def setChecksumNull: Self = StObject.set(x, "checksum", null)
      
      inline def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
      
      inline def setCommentNull: Self = StObject.set(x, "comment", null)
      
      inline def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      inline def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
      
      inline def setTimestamp(value: String): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
      
      inline def setTimestampNull: Self = StObject.set(x, "timestamp", null)
    }
  }
  
  type EmptyObject = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in any ]: never}
    */ typings.marv.marvStrings.EmptyObject & TopLevel[Any]
  
  type ErrorOnlyCallback = js.Function1[/* error */ js.UndefOr[js.Error], Unit]
  
  trait ParsedMigration extends StObject {
    
    var comment: String
    
    var directives: Record[String, String]
    
    var filename: String
    
    var level: Double
    
    var namespace: String
    
    var script: String
  }
  object ParsedMigration {
    
    inline def apply(
      comment: String,
      directives: Record[String, String],
      filename: String,
      level: Double,
      namespace: String,
      script: String
    ): ParsedMigration = {
      val __obj = js.Dynamic.literal(comment = comment.asInstanceOf[js.Any], directives = directives.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], script = script.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParsedMigration]
    }
    
    extension [Self <: ParsedMigration](x: Self) {
      
      inline def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
      
      inline def setDirectives(value: Record[String, String]): Self = StObject.set(x, "directives", value.asInstanceOf[js.Any])
      
      inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      inline def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      inline def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
      
      inline def setScript(value: String): Self = StObject.set(x, "script", value.asInstanceOf[js.Any])
    }
  }
  
  trait ScanOptions extends StObject {
    
    var directives: js.UndefOr[Record[String, String]] = js.undefined
    
    var filter: js.UndefOr[js.RegExp] = js.undefined
    
    /**
      * @deprecated Replaced by `directives`
      */
    var migrations: js.UndefOr[Record[String, String]] = js.undefined
    
    var quiet: js.UndefOr[Boolean] = js.undefined
  }
  object ScanOptions {
    
    inline def apply(): ScanOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ScanOptions]
    }
    
    extension [Self <: ScanOptions](x: Self) {
      
      inline def setDirectives(value: Record[String, String]): Self = StObject.set(x, "directives", value.asInstanceOf[js.Any])
      
      inline def setDirectivesUndefined: Self = StObject.set(x, "directives", js.undefined)
      
      inline def setFilter(value: js.RegExp): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      inline def setMigrations(value: Record[String, String]): Self = StObject.set(x, "migrations", value.asInstanceOf[js.Any])
      
      inline def setMigrationsUndefined: Self = StObject.set(x, "migrations", js.undefined)
      
      inline def setQuiet(value: Boolean): Self = StObject.set(x, "quiet", value.asInstanceOf[js.Any])
      
      inline def setQuietUndefined: Self = StObject.set(x, "quiet", js.undefined)
    }
  }
}
