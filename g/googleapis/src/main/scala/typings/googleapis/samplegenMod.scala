package typings.googleapis

import typings.googleapisCommon.schemaMod.Schema
import typings.googleapisCommon.schemaMod.SchemaMethod
import typings.googleapisCommon.schemaMod.SchemaMethods
import typings.googleapisCommon.schemaMod.SchemaResources
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object samplegenMod {
  
  @JSImport("googleapis/build/src/generator/samplegen", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addFragments(schema: Schema): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("addFragments")(schema.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def generateSamples(apiPath: String, schema: Schema): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("generateSamples")(apiPath.asInstanceOf[js.Any], schema.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def getAllMethods(bag: MethodBag): js.Array[SchemaMethod] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAllMethods")(bag.asInstanceOf[js.Any]).asInstanceOf[js.Array[SchemaMethod]]
  inline def getAllMethods(bag: MethodBag, methods: js.Array[SchemaMethod]): js.Array[SchemaMethod] = (^.asInstanceOf[js.Dynamic].applyDynamic("getAllMethods")(bag.asInstanceOf[js.Any], methods.asInstanceOf[js.Any])).asInstanceOf[js.Array[SchemaMethod]]
  
  trait MethodBag extends StObject {
    
    var methods: js.UndefOr[SchemaMethods] = js.undefined
    
    var resources: js.UndefOr[SchemaResources] = js.undefined
  }
  object MethodBag {
    
    inline def apply(): MethodBag = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MethodBag]
    }
    
    extension [Self <: MethodBag](x: Self) {
      
      inline def setMethods(value: SchemaMethods): Self = StObject.set(x, "methods", value.asInstanceOf[js.Any])
      
      inline def setMethodsUndefined: Self = StObject.set(x, "methods", js.undefined)
      
      inline def setResources(value: SchemaResources): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
      
      inline def setResourcesUndefined: Self = StObject.set(x, "resources", js.undefined)
    }
  }
}
