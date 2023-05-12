package typings.gorillaEngine.GorillaEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Blob extends StObject {
  
  def getInstrumentNames(): js.Array[String]
  
  def loadInstrument(name: String): Instrument
}
object Blob {
  
  inline def apply(getInstrumentNames: () => js.Array[String], loadInstrument: String => Instrument): Blob = {
    val __obj = js.Dynamic.literal(getInstrumentNames = js.Any.fromFunction0(getInstrumentNames), loadInstrument = js.Any.fromFunction1(loadInstrument))
    __obj.asInstanceOf[Blob]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Blob] (val x: Self) extends AnyVal {
    
    inline def setGetInstrumentNames(value: () => js.Array[String]): Self = StObject.set(x, "getInstrumentNames", js.Any.fromFunction0(value))
    
    inline def setLoadInstrument(value: String => Instrument): Self = StObject.set(x, "loadInstrument", js.Any.fromFunction1(value))
  }
}
