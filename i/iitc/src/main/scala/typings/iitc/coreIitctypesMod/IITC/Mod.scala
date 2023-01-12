package typings.iitc.coreIitctypesMod.IITC

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Mod extends StObject {
  
  var name: String
  
  var owner: String
  
  var rarity: ModRarity
  
  var stats: StringDictionary[String]
}
object Mod {
  
  inline def apply(name: String, owner: String, rarity: ModRarity, stats: StringDictionary[String]): Mod = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], rarity = rarity.asInstanceOf[js.Any], stats = stats.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mod]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Mod] (val x: Self) extends AnyVal {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setRarity(value: ModRarity): Self = StObject.set(x, "rarity", value.asInstanceOf[js.Any])
    
    inline def setStats(value: StringDictionary[String]): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
  }
}
