package typings.hermesProfileTransformer.eventInterfacesMod

import org.scalablytyped.runtime.TopLevel
import typings.hermesProfileTransformer.phasesMod.EventsPhase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SharedEventProperties extends js.Object {
  
  /**
    * event arguments
    */
  var args: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in string ]: any}
    */ typings.hermesProfileTransformer.hermesProfileTransformerStrings.SharedEventProperties with TopLevel[js.Any]
  ] = js.native
  
  /**
    * event category
    */
  var cat: js.UndefOr[String] = js.native
  
  /**
    * a fixed color name
    */
  var cname: js.UndefOr[String] = js.native
  
  /**
    * name of the event
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * event type (phase)
    */
  var ph: EventsPhase = js.native
  
  /**
    * process ID
    */
  var pid: js.UndefOr[Double] = js.native
  
  /**
    * id for a stackFrame object
    */
  var sf: js.UndefOr[Double] = js.native
  
  /**
    * thread ID
    */
  var tid: js.UndefOr[Double] = js.native
  
  /**
    * tracing clock timestamp
    */
  var ts: js.UndefOr[Double] = js.native
  
  /**
    * thread clock timestamp
    */
  var tts: js.UndefOr[Double] = js.native
}
object SharedEventProperties {
  
  @scala.inline
  def apply(ph: EventsPhase): SharedEventProperties = {
    val __obj = js.Dynamic.literal(ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[SharedEventProperties]
  }
  
  @scala.inline
  implicit class SharedEventPropertiesOps[Self <: SharedEventProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setPh(value: EventsPhase): Self = this.set("ph", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArgs(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ key in string ]: any}
      */ typings.hermesProfileTransformer.hermesProfileTransformerStrings.SharedEventProperties with TopLevel[js.Any]
    ): Self = this.set("args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArgs: Self = this.set("args", js.undefined)
    
    @scala.inline
    def setCat(value: String): Self = this.set("cat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCat: Self = this.set("cat", js.undefined)
    
    @scala.inline
    def setCname(value: String): Self = this.set("cname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCname: Self = this.set("cname", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setPid(value: Double): Self = this.set("pid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePid: Self = this.set("pid", js.undefined)
    
    @scala.inline
    def setSf(value: Double): Self = this.set("sf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSf: Self = this.set("sf", js.undefined)
    
    @scala.inline
    def setTid(value: Double): Self = this.set("tid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTid: Self = this.set("tid", js.undefined)
    
    @scala.inline
    def setTs(value: Double): Self = this.set("ts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTs: Self = this.set("ts", js.undefined)
    
    @scala.inline
    def setTts(value: Double): Self = this.set("tts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTts: Self = this.set("tts", js.undefined)
  }
}
