package typings.iitc.iitctypesMod.IITC

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Mod extends StObject {
  
  var name: String = js.native
  
  var owner: String = js.native
  
  var rarity: ModRarity = js.native
  
  var stats: StringDictionary[String] = js.native
}
object Mod {
  
  @scala.inline
  def apply(name: String, owner: String, rarity: ModRarity, stats: StringDictionary[String]): Mod = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], rarity = rarity.asInstanceOf[js.Any], stats = stats.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mod]
  }
  
  @scala.inline
  implicit class ModMutableBuilder[Self <: Mod] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRarity(value: ModRarity): Self = StObject.set(x, "rarity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStats(value: StringDictionary[String]): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
  }
}
