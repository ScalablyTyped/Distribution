package typings.jss.mod

import typings.jss.anon.Instantiable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JssOptions extends StObject {
  
  var Renderer: js.UndefOr[Instantiable | Null] = js.undefined
  
  def createGenerateId(): GenerateId
  def createGenerateId(options: CreateGenerateIdOptions): GenerateId
  @JSName("createGenerateId")
  var createGenerateId_Original: CreateGenerateId_
  
  var id: CreateGenerateIdOptions
  
  var insertionPoint: InsertionPoint
  
  var plugins: js.Array[Plugin]
}
object JssOptions {
  
  inline def apply(
    createGenerateId: /* options */ js.UndefOr[CreateGenerateIdOptions] => GenerateId,
    id: CreateGenerateIdOptions,
    insertionPoint: InsertionPoint,
    plugins: js.Array[Plugin]
  ): JssOptions = {
    val __obj = js.Dynamic.literal(createGenerateId = js.Any.fromFunction1(createGenerateId), id = id.asInstanceOf[js.Any], insertionPoint = insertionPoint.asInstanceOf[js.Any], plugins = plugins.asInstanceOf[js.Any])
    __obj.asInstanceOf[JssOptions]
  }
  
  extension [Self <: JssOptions](x: Self) {
    
    inline def setCreateGenerateId(value: /* options */ js.UndefOr[CreateGenerateIdOptions] => GenerateId): Self = StObject.set(x, "createGenerateId", js.Any.fromFunction1(value))
    
    inline def setId(value: CreateGenerateIdOptions): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setInsertionPoint(value: InsertionPoint): Self = StObject.set(x, "insertionPoint", value.asInstanceOf[js.Any])
    
    inline def setPlugins(value: js.Array[Plugin]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
    
    inline def setPluginsVarargs(value: Plugin*): Self = StObject.set(x, "plugins", js.Array(value*))
    
    inline def setRenderer(value: Instantiable): Self = StObject.set(x, "Renderer", value.asInstanceOf[js.Any])
    
    inline def setRendererNull: Self = StObject.set(x, "Renderer", null)
    
    inline def setRendererUndefined: Self = StObject.set(x, "Renderer", js.undefined)
  }
}
