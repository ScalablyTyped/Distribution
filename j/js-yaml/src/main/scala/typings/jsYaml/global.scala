package typings.jsYaml

import typings.jsYaml.mod.DumpOptions
import typings.jsYaml.mod.LoadOptions
import typings.jsYaml.mod.SchemaDefinition
import typings.jsYaml.mod.TypeConstructorOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object jsyaml {
    
    @JSGlobal("jsyaml")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("jsyaml.CORE_SCHEMA")
    @js.native
    def CORE_SCHEMA: typings.jsYaml.mod.Schema = js.native
    inline def CORE_SCHEMA_=(x: typings.jsYaml.mod.Schema): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CORE_SCHEMA")(x.asInstanceOf[js.Any])
    
    @JSGlobal("jsyaml.DEFAULT_FULL_SCHEMA")
    @js.native
    def DEFAULT_FULL_SCHEMA: typings.jsYaml.mod.Schema = js.native
    inline def DEFAULT_FULL_SCHEMA_=(x: typings.jsYaml.mod.Schema): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_FULL_SCHEMA")(x.asInstanceOf[js.Any])
    
    @JSGlobal("jsyaml.DEFAULT_SAFE_SCHEMA")
    @js.native
    def DEFAULT_SAFE_SCHEMA: typings.jsYaml.mod.Schema = js.native
    inline def DEFAULT_SAFE_SCHEMA_=(x: typings.jsYaml.mod.Schema): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_SAFE_SCHEMA")(x.asInstanceOf[js.Any])
    
    @JSGlobal("jsyaml.FAILSAFE_SCHEMA")
    @js.native
    def FAILSAFE_SCHEMA: typings.jsYaml.mod.Schema = js.native
    inline def FAILSAFE_SCHEMA_=(x: typings.jsYaml.mod.Schema): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FAILSAFE_SCHEMA")(x.asInstanceOf[js.Any])
    
    @JSGlobal("jsyaml.JSON_SCHEMA")
    @js.native
    def JSON_SCHEMA: typings.jsYaml.mod.Schema = js.native
    inline def JSON_SCHEMA_=(x: typings.jsYaml.mod.Schema): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("JSON_SCHEMA")(x.asInstanceOf[js.Any])
    
    @JSGlobal("jsyaml.MINIMAL_SCHEMA")
    @js.native
    def MINIMAL_SCHEMA: typings.jsYaml.mod.Schema = js.native
    inline def MINIMAL_SCHEMA_=(x: typings.jsYaml.mod.Schema): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MINIMAL_SCHEMA")(x.asInstanceOf[js.Any])
    
    @JSGlobal("jsyaml.SAFE_SCHEMA")
    @js.native
    def SAFE_SCHEMA: typings.jsYaml.mod.Schema = js.native
    inline def SAFE_SCHEMA_=(x: typings.jsYaml.mod.Schema): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SAFE_SCHEMA")(x.asInstanceOf[js.Any])
    
    @JSGlobal("jsyaml.Schema")
    @js.native
    class Schema protected ()
      extends typings.jsYaml.mod.Schema {
      def this(definition: SchemaDefinition) = this()
    }
    /* static members */
    object Schema {
      
      @JSGlobal("jsyaml.Schema")
      @js.native
      val ^ : js.Any = js.native
      
      inline def create(schemas: js.Array[typings.jsYaml.mod.Schema], types: js.Array[typings.jsYaml.mod.Type]): typings.jsYaml.mod.Schema = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(schemas.asInstanceOf[js.Any], types.asInstanceOf[js.Any])).asInstanceOf[typings.jsYaml.mod.Schema]
      inline def create(schemas: js.Array[typings.jsYaml.mod.Schema], types: typings.jsYaml.mod.Type): typings.jsYaml.mod.Schema = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(schemas.asInstanceOf[js.Any], types.asInstanceOf[js.Any])).asInstanceOf[typings.jsYaml.mod.Schema]
      inline def create(schemas: typings.jsYaml.mod.Schema, types: js.Array[typings.jsYaml.mod.Type]): typings.jsYaml.mod.Schema = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(schemas.asInstanceOf[js.Any], types.asInstanceOf[js.Any])).asInstanceOf[typings.jsYaml.mod.Schema]
      inline def create(schemas: typings.jsYaml.mod.Schema, types: typings.jsYaml.mod.Type): typings.jsYaml.mod.Schema = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(schemas.asInstanceOf[js.Any], types.asInstanceOf[js.Any])).asInstanceOf[typings.jsYaml.mod.Schema]
      inline def create(types: js.Array[typings.jsYaml.mod.Type]): typings.jsYaml.mod.Schema = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(types.asInstanceOf[js.Any]).asInstanceOf[typings.jsYaml.mod.Schema]
      inline def create(types: typings.jsYaml.mod.Type): typings.jsYaml.mod.Schema = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(types.asInstanceOf[js.Any]).asInstanceOf[typings.jsYaml.mod.Schema]
    }
    
    @JSGlobal("jsyaml.Type")
    @js.native
    class Type protected ()
      extends typings.jsYaml.mod.Type {
      def this(tag: String) = this()
      def this(tag: String, opts: TypeConstructorOptions) = this()
    }
    
    @JSGlobal("jsyaml.YAMLException")
    @js.native
    class YAMLException ()
      extends typings.jsYaml.mod.YAMLException {
      def this(reason: js.Any) = this()
      def this(reason: js.Any, mark: js.Any) = this()
      def this(reason: Unit, mark: js.Any) = this()
    }
    
    inline def dump(obj: js.Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("dump")(obj.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def dump(obj: js.Any, opts: DumpOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("dump")(obj.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def load(str: String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("load")(str.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    inline def load(str: String, opts: LoadOptions): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(str.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    
    inline def loadAll(str: String): js.Array[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("loadAll")(str.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Any]]
    inline def loadAll(str: String, iterator: js.Function1[/* doc */ js.Any, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loadAll")(str.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def loadAll(str: String, iterator: js.Function1[/* doc */ js.Any, Unit], opts: LoadOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loadAll")(str.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def loadAll(str: String, iterator: Null, opts: LoadOptions): js.Array[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("loadAll")(str.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Any]]
    inline def loadAll(str: String, iterator: Unit, opts: LoadOptions): js.Array[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("loadAll")(str.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Any]]
    
    inline def safeDump(obj: js.Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("safeDump")(obj.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def safeDump(obj: js.Any, opts: DumpOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("safeDump")(obj.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def safeLoad(str: String): js.UndefOr[String | js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("safeLoad")(str.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String | js.Object]]
    inline def safeLoad(str: String, opts: LoadOptions): js.UndefOr[String | js.Object] = (^.asInstanceOf[js.Dynamic].applyDynamic("safeLoad")(str.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String | js.Object]]
    
    inline def safeLoadAll(str: String): js.Array[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("safeLoadAll")(str.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Any]]
    inline def safeLoadAll(str: String, iterator: js.Function1[/* doc */ js.Any, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("safeLoadAll")(str.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def safeLoadAll(str: String, iterator: js.Function1[/* doc */ js.Any, Unit], opts: LoadOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("safeLoadAll")(str.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def safeLoadAll(str: String, iterator: Null, opts: LoadOptions): js.Array[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("safeLoadAll")(str.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Any]]
    inline def safeLoadAll(str: String, iterator: Unit, opts: LoadOptions): js.Array[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("safeLoadAll")(str.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Any]]
  }
}
