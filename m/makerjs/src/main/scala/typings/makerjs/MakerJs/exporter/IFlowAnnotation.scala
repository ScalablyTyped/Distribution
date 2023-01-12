package typings.makerjs.MakerJs.exporter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *  Annotate paths with directional flow marks.
  */
trait IFlowAnnotation extends StObject {
  
  /**
    * Size of flow marks (arrows and circle).
    */
  var size: Double
}
object IFlowAnnotation {
  
  inline def apply(size: Double): IFlowAnnotation = {
    val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFlowAnnotation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IFlowAnnotation] (val x: Self) extends AnyVal {
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
  }
}
