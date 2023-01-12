package typings.kavenegar.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Apilogs extends StObject {
  
  var apilogs: js.UndefOr[String] = js.undefined
  
  var dailyreport: js.UndefOr[String] = js.undefined
  
  var debugmode: js.UndefOr[String] = js.undefined
  
  var defaultsender: js.UndefOr[String] = js.undefined
  
  var mincreditalarm: js.UndefOr[Double] = js.undefined
  
  var resendfailed: js.UndefOr[String] = js.undefined
}
object Apilogs {
  
  inline def apply(): Apilogs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Apilogs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Apilogs] (val x: Self) extends AnyVal {
    
    inline def setApilogs(value: String): Self = StObject.set(x, "apilogs", value.asInstanceOf[js.Any])
    
    inline def setApilogsUndefined: Self = StObject.set(x, "apilogs", js.undefined)
    
    inline def setDailyreport(value: String): Self = StObject.set(x, "dailyreport", value.asInstanceOf[js.Any])
    
    inline def setDailyreportUndefined: Self = StObject.set(x, "dailyreport", js.undefined)
    
    inline def setDebugmode(value: String): Self = StObject.set(x, "debugmode", value.asInstanceOf[js.Any])
    
    inline def setDebugmodeUndefined: Self = StObject.set(x, "debugmode", js.undefined)
    
    inline def setDefaultsender(value: String): Self = StObject.set(x, "defaultsender", value.asInstanceOf[js.Any])
    
    inline def setDefaultsenderUndefined: Self = StObject.set(x, "defaultsender", js.undefined)
    
    inline def setMincreditalarm(value: Double): Self = StObject.set(x, "mincreditalarm", value.asInstanceOf[js.Any])
    
    inline def setMincreditalarmUndefined: Self = StObject.set(x, "mincreditalarm", js.undefined)
    
    inline def setResendfailed(value: String): Self = StObject.set(x, "resendfailed", value.asInstanceOf[js.Any])
    
    inline def setResendfailedUndefined: Self = StObject.set(x, "resendfailed", js.undefined)
  }
}
