package typings.hermesProfileTransformer.eventInterfacesMod

import org.scalablytyped.runtime.TopLevel
import typings.hermesProfileTransformer.phasesMod.EventsPhase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SharedEventProperties extends StObject {
  
  /**
    * event arguments
    */
  var args: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in string ]: any}
    */ typings.hermesProfileTransformer.hermesProfileTransformerStrings.SharedEventProperties & TopLevel[Any]
  ] = js.undefined
  
  /**
    * event category
    */
  var cat: js.UndefOr[String] = js.undefined
  
  /**
    * a fixed color name
    */
  var cname: js.UndefOr[String] = js.undefined
  
  /**
    * name of the event
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * event type (phase)
    */
  var ph: EventsPhase
  
  /**
    * process ID
    */
  var pid: js.UndefOr[Double] = js.undefined
  
  /**
    * id for a stackFrame object
    */
  var sf: js.UndefOr[Double] = js.undefined
  
  /**
    * thread ID
    */
  var tid: js.UndefOr[Double] = js.undefined
  
  /**
    * tracing clock timestamp
    */
  var ts: js.UndefOr[Double] = js.undefined
  
  /**
    * thread clock timestamp
    */
  var tts: js.UndefOr[Double] = js.undefined
}
object SharedEventProperties {
  
  inline def apply(ph: EventsPhase): SharedEventProperties = {
    val __obj = js.Dynamic.literal(ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[SharedEventProperties]
  }
  
  extension [Self <: SharedEventProperties](x: Self) {
    
    inline def setArgs(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ key in string ]: any}
      */ typings.hermesProfileTransformer.hermesProfileTransformerStrings.SharedEventProperties & TopLevel[Any]
    ): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    inline def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
    
    inline def setCat(value: String): Self = StObject.set(x, "cat", value.asInstanceOf[js.Any])
    
    inline def setCatUndefined: Self = StObject.set(x, "cat", js.undefined)
    
    inline def setCname(value: String): Self = StObject.set(x, "cname", value.asInstanceOf[js.Any])
    
    inline def setCnameUndefined: Self = StObject.set(x, "cname", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPh(value: EventsPhase): Self = StObject.set(x, "ph", value.asInstanceOf[js.Any])
    
    inline def setPid(value: Double): Self = StObject.set(x, "pid", value.asInstanceOf[js.Any])
    
    inline def setPidUndefined: Self = StObject.set(x, "pid", js.undefined)
    
    inline def setSf(value: Double): Self = StObject.set(x, "sf", value.asInstanceOf[js.Any])
    
    inline def setSfUndefined: Self = StObject.set(x, "sf", js.undefined)
    
    inline def setTid(value: Double): Self = StObject.set(x, "tid", value.asInstanceOf[js.Any])
    
    inline def setTidUndefined: Self = StObject.set(x, "tid", js.undefined)
    
    inline def setTs(value: Double): Self = StObject.set(x, "ts", value.asInstanceOf[js.Any])
    
    inline def setTsUndefined: Self = StObject.set(x, "ts", js.undefined)
    
    inline def setTts(value: Double): Self = StObject.set(x, "tts", value.asInstanceOf[js.Any])
    
    inline def setTtsUndefined: Self = StObject.set(x, "tts", js.undefined)
  }
}
