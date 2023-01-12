package typings.kavenegar.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Dailyreport extends StObject {
  
  var apilogs: String
  
  var dailyreport: String
  
  var debugmode: String
  
  var defaultsender: String
  
  var mincreditalarm: Double
  
  var resendfailed: String
}
object Dailyreport {
  
  inline def apply(
    apilogs: String,
    dailyreport: String,
    debugmode: String,
    defaultsender: String,
    mincreditalarm: Double,
    resendfailed: String
  ): Dailyreport = {
    val __obj = js.Dynamic.literal(apilogs = apilogs.asInstanceOf[js.Any], dailyreport = dailyreport.asInstanceOf[js.Any], debugmode = debugmode.asInstanceOf[js.Any], defaultsender = defaultsender.asInstanceOf[js.Any], mincreditalarm = mincreditalarm.asInstanceOf[js.Any], resendfailed = resendfailed.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dailyreport]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Dailyreport] (val x: Self) extends AnyVal {
    
    inline def setApilogs(value: String): Self = StObject.set(x, "apilogs", value.asInstanceOf[js.Any])
    
    inline def setDailyreport(value: String): Self = StObject.set(x, "dailyreport", value.asInstanceOf[js.Any])
    
    inline def setDebugmode(value: String): Self = StObject.set(x, "debugmode", value.asInstanceOf[js.Any])
    
    inline def setDefaultsender(value: String): Self = StObject.set(x, "defaultsender", value.asInstanceOf[js.Any])
    
    inline def setMincreditalarm(value: Double): Self = StObject.set(x, "mincreditalarm", value.asInstanceOf[js.Any])
    
    inline def setResendfailed(value: String): Self = StObject.set(x, "resendfailed", value.asInstanceOf[js.Any])
  }
}
