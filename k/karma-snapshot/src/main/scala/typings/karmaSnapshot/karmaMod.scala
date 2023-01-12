package typings.karmaSnapshot

import org.scalablytyped.runtime.StringDictionary
import typings.karmaSnapshot.anon.Name
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object karmaMod {
  
  trait ConfigOptions extends StObject {
    
    /**
      * See {@link https://github.com/localvoid/karma-snapshot#config}
      */
    var snapshot: js.UndefOr[SnapshotOptions] = js.undefined
  }
  object ConfigOptions {
    
    inline def apply(): ConfigOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConfigOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ConfigOptions] (val x: Self) extends AnyVal {
      
      inline def setSnapshot(value: SnapshotOptions): Self = StObject.set(x, "snapshot", value.asInstanceOf[js.Any])
      
      inline def setSnapshotUndefined: Self = StObject.set(x, "snapshot", js.undefined)
    }
  }
  
  /**
    * details about snapshot.
    */
  trait Snapshot extends StObject {
    
    /**
      * snapshot value that will be checked by an assertion plugin
      */
    var code: String
    
    /**
      * Flag that should be marked by an assertion plugin when it updates or adds a new snapshot
      */
    var dirty: js.UndefOr[Boolean] = js.undefined
    
    /**
      * which language should be used in a markdown format to improve readability
      */
    var lang: js.UndefOr[String] = js.undefined
    
    /**
      * Flag that should be marked by an assertion plugin when it visits suites and snapshots.
      * Visited flags are used to automatically prune removed snapshots
      */
    var visited: js.UndefOr[Boolean] = js.undefined
  }
  object Snapshot {
    
    inline def apply(code: String): Snapshot = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
      __obj.asInstanceOf[Snapshot]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Snapshot] (val x: Self) extends AnyVal {
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setDirty(value: Boolean): Self = StObject.set(x, "dirty", value.asInstanceOf[js.Any])
      
      inline def setDirtyUndefined: Self = StObject.set(x, "dirty", js.undefined)
      
      inline def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
      
      inline def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
      
      inline def setVisited(value: Boolean): Self = StObject.set(x, "visited", value.asInstanceOf[js.Any])
      
      inline def setVisitedUndefined: Self = StObject.set(x, "visited", js.undefined)
    }
  }
  
  trait SnapshotOptions extends StObject {
    
    /**
      * Checks existince of the source file associated with tests
      * @default false
      */
    var checkSourceFile: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Snapshot format
      * @default 'md'
      */
    var format: js.UndefOr[String | SnapshotSerializer] = js.undefined
    
    /**
      * Limit number of unused snapshots reported in the warning.
      * `-1` means unlimited.
      * @default -1
      */
    var limitUnusedSnapshotsInWarning: js.UndefOr[Double] = js.undefined
    
    /**
      * Custom path resolver
      */
    var pathResolver: js.UndefOr[SnapshotPathResolver] = js.undefined
    
    /**
      * Prune unused snapshots
      * @default false
      */
    var prune: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Run snapshot tests in UPDATE mode
      * @default false
      */
    var update: js.UndefOr[Boolean] = js.undefined
  }
  object SnapshotOptions {
    
    inline def apply(): SnapshotOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SnapshotOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SnapshotOptions] (val x: Self) extends AnyVal {
      
      inline def setCheckSourceFile(value: Boolean): Self = StObject.set(x, "checkSourceFile", value.asInstanceOf[js.Any])
      
      inline def setCheckSourceFileUndefined: Self = StObject.set(x, "checkSourceFile", js.undefined)
      
      inline def setFormat(value: String | SnapshotSerializer): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setLimitUnusedSnapshotsInWarning(value: Double): Self = StObject.set(x, "limitUnusedSnapshotsInWarning", value.asInstanceOf[js.Any])
      
      inline def setLimitUnusedSnapshotsInWarningUndefined: Self = StObject.set(x, "limitUnusedSnapshotsInWarning", js.undefined)
      
      inline def setPathResolver(value: (/* basePath */ String, /* suiteName */ String) => String): Self = StObject.set(x, "pathResolver", js.Any.fromFunction2(value))
      
      inline def setPathResolverUndefined: Self = StObject.set(x, "pathResolver", js.undefined)
      
      inline def setPrune(value: Boolean): Self = StObject.set(x, "prune", value.asInstanceOf[js.Any])
      
      inline def setPruneUndefined: Self = StObject.set(x, "prune", js.undefined)
      
      inline def setUpdate(value: Boolean): Self = StObject.set(x, "update", value.asInstanceOf[js.Any])
      
      inline def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
    }
  }
  
  /**
    * Custom path resolver
    */
  type SnapshotPathResolver = js.Function2[/* basePath */ String, /* suiteName */ String, String]
  
  /**
    * Custom serializer
    */
  trait SnapshotSerializer extends StObject {
    
    def deserialize(content: String): Name
    
    def serialize(name: String, suite: SnapshotSuite): String
  }
  object SnapshotSerializer {
    
    inline def apply(deserialize: String => Name, serialize: (String, SnapshotSuite) => String): SnapshotSerializer = {
      val __obj = js.Dynamic.literal(deserialize = js.Any.fromFunction1(deserialize), serialize = js.Any.fromFunction2(serialize))
      __obj.asInstanceOf[SnapshotSerializer]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SnapshotSerializer] (val x: Self) extends AnyVal {
      
      inline def setDeserialize(value: String => Name): Self = StObject.set(x, "deserialize", js.Any.fromFunction1(value))
      
      inline def setSerialize(value: (String, SnapshotSuite) => String): Self = StObject.set(x, "serialize", js.Any.fromFunction2(value))
    }
  }
  
  // these are required to correctly implement custom serializer
  /**
    * a tree with snapshots that has a similar structure to test suites
    */
  trait SnapshotSuite extends StObject {
    
    /** references to children suites, */
    var children: StringDictionary[SnapshotSuite]
    
    var dirty: js.UndefOr[Boolean] = js.undefined
    
    /** snapshot lists for tests in the current snapshot */
    var snapshots: StringDictionary[js.Array[Snapshot]]
    
    var visited: js.UndefOr[Boolean] = js.undefined
  }
  object SnapshotSuite {
    
    inline def apply(children: StringDictionary[SnapshotSuite], snapshots: StringDictionary[js.Array[Snapshot]]): SnapshotSuite = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], snapshots = snapshots.asInstanceOf[js.Any])
      __obj.asInstanceOf[SnapshotSuite]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SnapshotSuite] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: StringDictionary[SnapshotSuite]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setDirty(value: Boolean): Self = StObject.set(x, "dirty", value.asInstanceOf[js.Any])
      
      inline def setDirtyUndefined: Self = StObject.set(x, "dirty", js.undefined)
      
      inline def setSnapshots(value: StringDictionary[js.Array[Snapshot]]): Self = StObject.set(x, "snapshots", value.asInstanceOf[js.Any])
      
      inline def setVisited(value: Boolean): Self = StObject.set(x, "visited", value.asInstanceOf[js.Any])
      
      inline def setVisitedUndefined: Self = StObject.set(x, "visited", js.undefined)
    }
  }
}
