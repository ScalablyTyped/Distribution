package typings.matrixJsSdk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Aliases extends StObject {
  
  var aliases: js.Array[String]
  
  var desc: String
  
  var numMembers: Double
  
  var timestamp: Double
  
  var title: String
}
object Aliases {
  
  inline def apply(aliases: js.Array[String], desc: String, numMembers: Double, timestamp: Double, title: String): Aliases = {
    val __obj = js.Dynamic.literal(aliases = aliases.asInstanceOf[js.Any], desc = desc.asInstanceOf[js.Any], numMembers = numMembers.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Aliases]
  }
  
  extension [Self <: Aliases](x: Self) {
    
    inline def setAliases(value: js.Array[String]): Self = StObject.set(x, "aliases", value.asInstanceOf[js.Any])
    
    inline def setAliasesVarargs(value: String*): Self = StObject.set(x, "aliases", js.Array(value*))
    
    inline def setDesc(value: String): Self = StObject.set(x, "desc", value.asInstanceOf[js.Any])
    
    inline def setNumMembers(value: Double): Self = StObject.set(x, "numMembers", value.asInstanceOf[js.Any])
    
    inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
