package typings.iitc.iitctypesMod.IITC

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Mod extends js.Object {
  
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
  implicit class ModOps[Self <: Mod] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwner(value: String): Self = this.set("owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRarity(value: ModRarity): Self = this.set("rarity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStats(value: StringDictionary[String]): Self = this.set("stats", value.asInstanceOf[js.Any])
  }
}
