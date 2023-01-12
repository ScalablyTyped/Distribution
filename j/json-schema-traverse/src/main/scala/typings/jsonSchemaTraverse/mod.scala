package typings.jsonSchemaTraverse

import org.scalablytyped.runtime.StringDictionary
import typings.jsonSchemaTraverse.anon.Post
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(schema: SchemaObject, cb: Callback): Unit = (^.asInstanceOf[js.Dynamic].apply(schema.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(schema: SchemaObject, opts: Options): Unit = (^.asInstanceOf[js.Dynamic].apply(schema.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(schema: SchemaObject, opts: Options, cb: Callback): Unit = (^.asInstanceOf[js.Dynamic].apply(schema.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("json-schema-traverse", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type Callback = js.Function7[
    /* schema */ SchemaObject, 
    /* jsonPtr */ String, 
    /* rootSchema */ SchemaObject, 
    /* parentJsonPtr */ js.UndefOr[String], 
    /* parentKeyword */ js.UndefOr[String], 
    /* parentSchema */ js.UndefOr[SchemaObject], 
    /* keyIndex */ js.UndefOr[String | Double], 
    Unit
  ]
  
  trait Options extends StObject {
    
    var allKeys: js.UndefOr[Boolean] = js.undefined
    
    var cb: js.UndefOr[Callback | Post] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setAllKeys(value: Boolean): Self = StObject.set(x, "allKeys", value.asInstanceOf[js.Any])
      
      inline def setAllKeysUndefined: Self = StObject.set(x, "allKeys", js.undefined)
      
      inline def setCb(value: Callback | Post): Self = StObject.set(x, "cb", value.asInstanceOf[js.Any])
      
      inline def setCbFunction7(
        value: (/* schema */ SchemaObject, /* jsonPtr */ String, /* rootSchema */ SchemaObject, /* parentJsonPtr */ js.UndefOr[String], /* parentKeyword */ js.UndefOr[String], /* parentSchema */ js.UndefOr[SchemaObject], /* keyIndex */ js.UndefOr[String | Double]) => Unit
      ): Self = StObject.set(x, "cb", js.Any.fromFunction7(value))
      
      inline def setCbUndefined: Self = StObject.set(x, "cb", js.undefined)
    }
  }
  
  trait SchemaObject
    extends StObject
       with /* x */ StringDictionary[Any] {
    
    @JSName("$id")
    var $id: js.UndefOr[String] = js.undefined
    
    @JSName("$schema")
    var $schema: js.UndefOr[String] = js.undefined
  }
  object SchemaObject {
    
    inline def apply(): SchemaObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SchemaObject]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SchemaObject] (val x: Self) extends AnyVal {
      
      inline def set$id(value: String): Self = StObject.set(x, "$id", value.asInstanceOf[js.Any])
      
      inline def set$idUndefined: Self = StObject.set(x, "$id", js.undefined)
      
      inline def set$schema(value: String): Self = StObject.set(x, "$schema", value.asInstanceOf[js.Any])
      
      inline def set$schemaUndefined: Self = StObject.set(x, "$schema", js.undefined)
    }
  }
}
