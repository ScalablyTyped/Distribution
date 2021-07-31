package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgGridAppendRowsOnDemandMethods extends StObject {
  
  /**
    * Destroys the append rows on demand widget
    */
  def destroy(): Unit
  
  /**
    * Loads the next chunk of data.
    */
  def nextChunk(): Unit
}
object IgGridAppendRowsOnDemandMethods {
  
  @scala.inline
  def apply(destroy: () => Unit, nextChunk: () => Unit): IgGridAppendRowsOnDemandMethods = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), nextChunk = js.Any.fromFunction0(nextChunk))
    __obj.asInstanceOf[IgGridAppendRowsOnDemandMethods]
  }
  
  @scala.inline
  implicit class IgGridAppendRowsOnDemandMethodsMutableBuilder[Self <: IgGridAppendRowsOnDemandMethods] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNextChunk(value: () => Unit): Self = StObject.set(x, "nextChunk", js.Any.fromFunction0(value))
  }
}
