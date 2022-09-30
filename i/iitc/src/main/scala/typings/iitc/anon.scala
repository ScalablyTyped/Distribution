package typings.iitc

import typings.iitc.hooksMod.global.EventPortalDetailLoaded
import typings.iitc.hooksMod.global.PortalDetailEnt
import typings.iitc.iitcBooleans.`false`
import typings.iitc.iitcBooleans.`true`
import typings.iitc.iitcStrings.ENLIGHTENED
import typings.iitc.iitcStrings.PLAYER_GENERATED
import typings.iitc.iitcStrings.RESISTANCE
import typings.iitc.iitcStrings.SYSTEM_BROADCAST
import typings.iitc.iitcStrings.SYSTEM_NARROWCAST
import typings.iitc.iitcStrings.portal_
import typings.iitc.iitctypesMod.IITC.PortalDataDetail
import typings.iitc.iitctypesMod.LinkGUID
import typings.iitc.iitctypesMod.PortalGUID
import typings.iitc.inteltypesMod.Intel.MarkUpPlayer
import typings.iitc.inteltypesMod.Intel.MarkUpPortal
import typings.iitc.inteltypesMod.Intel.MarkUpText
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Attackfrequency extends StObject {
    
    var attack_frequency: Double
    
    var force_amplifier: Double
    
    var hit_bonus: Double
  }
  object Attackfrequency {
    
    inline def apply(attack_frequency: Double, force_amplifier: Double, hit_bonus: Double): Attackfrequency = {
      val __obj = js.Dynamic.literal(attack_frequency = attack_frequency.asInstanceOf[js.Any], force_amplifier = force_amplifier.asInstanceOf[js.Any], hit_bonus = hit_bonus.asInstanceOf[js.Any])
      __obj.asInstanceOf[Attackfrequency]
    }
    
    extension [Self <: Attackfrequency](x: Self) {
      
      inline def setAttack_frequency(value: Double): Self = StObject.set(x, "attack_frequency", value.asInstanceOf[js.Any])
      
      inline def setForce_amplifier(value: Double): Self = StObject.set(x, "force_amplifier", value.asInstanceOf[js.Any])
      
      inline def setHit_bonus(value: Double): Self = StObject.set(x, "hit_bonus", value.asInstanceOf[js.Any])
    }
  }
  
  trait Burnout extends StObject {
    
    var burnout: Double
    
    var cooldown: Double
    
    var hacks: Double
  }
  object Burnout {
    
    inline def apply(burnout: Double, cooldown: Double, hacks: Double): Burnout = {
      val __obj = js.Dynamic.literal(burnout = burnout.asInstanceOf[js.Any], cooldown = cooldown.asInstanceOf[js.Any], hacks = hacks.asInstanceOf[js.Any])
      __obj.asInstanceOf[Burnout]
    }
    
    extension [Self <: Burnout](x: Self) {
      
      inline def setBurnout(value: Double): Self = StObject.set(x, "burnout", value.asInstanceOf[js.Any])
      
      inline def setCooldown(value: Double): Self = StObject.set(x, "cooldown", value.asInstanceOf[js.Any])
      
      inline def setHacks(value: Double): Self = StObject.set(x, "hacks", value.asInstanceOf[js.Any])
    }
  }
  
  trait CaptureAp extends StObject {
    
    var captureAp: Double
    
    var destroyAp: Double
    
    var destroyResoAp: Double
    
    var enemyAp: Double
    
    var friendlyAp: Double
  }
  object CaptureAp {
    
    inline def apply(captureAp: Double, destroyAp: Double, destroyResoAp: Double, enemyAp: Double, friendlyAp: Double): CaptureAp = {
      val __obj = js.Dynamic.literal(captureAp = captureAp.asInstanceOf[js.Any], destroyAp = destroyAp.asInstanceOf[js.Any], destroyResoAp = destroyResoAp.asInstanceOf[js.Any], enemyAp = enemyAp.asInstanceOf[js.Any], friendlyAp = friendlyAp.asInstanceOf[js.Any])
      __obj.asInstanceOf[CaptureAp]
    }
    
    extension [Self <: CaptureAp](x: Self) {
      
      inline def setCaptureAp(value: Double): Self = StObject.set(x, "captureAp", value.asInstanceOf[js.Any])
      
      inline def setDestroyAp(value: Double): Self = StObject.set(x, "destroyAp", value.asInstanceOf[js.Any])
      
      inline def setDestroyResoAp(value: Double): Self = StObject.set(x, "destroyResoAp", value.asInstanceOf[js.Any])
      
      inline def setEnemyAp(value: Double): Self = StObject.set(x, "enemyAp", value.asInstanceOf[js.Any])
      
      inline def setFriendlyAp(value: Double): Self = StObject.set(x, "friendlyAp", value.asInstanceOf[js.Any])
    }
  }
  
  trait DeployCount extends StObject {
    
    var captureAp: Double
    
    var deployCount: Double
    
    var destroyAp: Double
    
    var enemyAp: Double
    
    var friendlyAp: Double
    
    var resoAp: Double
    
    var upgradeCount: Double
  }
  object DeployCount {
    
    inline def apply(
      captureAp: Double,
      deployCount: Double,
      destroyAp: Double,
      enemyAp: Double,
      friendlyAp: Double,
      resoAp: Double,
      upgradeCount: Double
    ): DeployCount = {
      val __obj = js.Dynamic.literal(captureAp = captureAp.asInstanceOf[js.Any], deployCount = deployCount.asInstanceOf[js.Any], destroyAp = destroyAp.asInstanceOf[js.Any], enemyAp = enemyAp.asInstanceOf[js.Any], friendlyAp = friendlyAp.asInstanceOf[js.Any], resoAp = resoAp.asInstanceOf[js.Any], upgradeCount = upgradeCount.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeployCount]
    }
    
    extension [Self <: DeployCount](x: Self) {
      
      inline def setCaptureAp(value: Double): Self = StObject.set(x, "captureAp", value.asInstanceOf[js.Any])
      
      inline def setDeployCount(value: Double): Self = StObject.set(x, "deployCount", value.asInstanceOf[js.Any])
      
      inline def setDestroyAp(value: Double): Self = StObject.set(x, "destroyAp", value.asInstanceOf[js.Any])
      
      inline def setEnemyAp(value: Double): Self = StObject.set(x, "enemyAp", value.asInstanceOf[js.Any])
      
      inline def setFriendlyAp(value: Double): Self = StObject.set(x, "friendlyAp", value.asInstanceOf[js.Any])
      
      inline def setResoAp(value: Double): Self = StObject.set(x, "resoAp", value.asInstanceOf[js.Any])
      
      inline def setUpgradeCount(value: Double): Self = StObject.set(x, "upgradeCount", value.asInstanceOf[js.Any])
    }
  }
  
  trait Details
    extends StObject
       with EventPortalDetailLoaded {
    
    var details: PortalDataDetail
    
    var ent: PortalDetailEnt
    
    var guid: String
    
    var success: `true`
  }
  object Details {
    
    inline def apply(details: PortalDataDetail, ent: PortalDetailEnt, guid: String): Details = {
      val __obj = js.Dynamic.literal(details = details.asInstanceOf[js.Any], ent = ent.asInstanceOf[js.Any], guid = guid.asInstanceOf[js.Any], success = true)
      __obj.asInstanceOf[Details]
    }
    
    extension [Self <: Details](x: Self) {
      
      inline def setDetails(value: PortalDataDetail): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
      
      inline def setEnt(value: PortalDetailEnt): Self = StObject.set(x, "ent", value.asInstanceOf[js.Any])
      
      inline def setGuid(value: String): Self = StObject.set(x, "guid", value.asInstanceOf[js.Any])
      
      inline def setSuccess(value: `true`): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
    }
  }
  
  trait Excess extends StObject {
    
    var excess: Double
    
    var linkDefenseBoost: Double
    
    var links: Double
    
    var shields: Double
  }
  object Excess {
    
    inline def apply(excess: Double, linkDefenseBoost: Double, links: Double, shields: Double): Excess = {
      val __obj = js.Dynamic.literal(excess = excess.asInstanceOf[js.Any], linkDefenseBoost = linkDefenseBoost.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], shields = shields.asInstanceOf[js.Any])
      __obj.asInstanceOf[Excess]
    }
    
    extension [Self <: Excess](x: Self) {
      
      inline def setExcess(value: Double): Self = StObject.set(x, "excess", value.asInstanceOf[js.Any])
      
      inline def setLinkDefenseBoost(value: Double): Self = StObject.set(x, "linkDefenseBoost", value.asInstanceOf[js.Any])
      
      inline def setLinks(value: Double): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
      
      inline def setShields(value: Double): Self = StObject.set(x, "shields", value.asInstanceOf[js.Any])
    }
  }
  
  trait Fragment extends StObject {
    
    var fragment: Any
    
    var target: Any
  }
  object Fragment {
    
    inline def apply(fragment: Any, target: Any): Fragment = {
      val __obj = js.Dynamic.literal(fragment = fragment.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[Fragment]
    }
    
    extension [Self <: Fragment](x: Self) {
      
      inline def setFragment(value: Any): Self = StObject.set(x, "fragment", value.asInstanceOf[js.Any])
      
      inline def setTarget(value: Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
  
  trait Guid
    extends StObject
       with EventPortalDetailLoaded {
    
    var guid: String
    
    var success: `false`
  }
  object Guid {
    
    inline def apply(guid: String): Guid = {
      val __obj = js.Dynamic.literal(guid = guid.asInstanceOf[js.Any], success = false)
      __obj.asInstanceOf[Guid]
    }
    
    extension [Self <: Guid](x: Self) {
      
      inline def setGuid(value: String): Self = StObject.set(x, "guid", value.asInstanceOf[js.Any])
      
      inline def setSuccess(value: `false`): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
    }
  }
  
  trait Health extends StObject {
    
    var health: Double
    
    var image: String
    
    var latE6: Double
    
    var level: Double
    
    var lngE6: Double
    
    var resCount: Double
    
    var team: Double
    
    var title: String
    
    var `type`: portal_
  }
  object Health {
    
    inline def apply(
      health: Double,
      image: String,
      latE6: Double,
      level: Double,
      lngE6: Double,
      resCount: Double,
      team: Double,
      title: String
    ): Health = {
      val __obj = js.Dynamic.literal(health = health.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], latE6 = latE6.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], lngE6 = lngE6.asInstanceOf[js.Any], resCount = resCount.asInstanceOf[js.Any], team = team.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("portal")
      __obj.asInstanceOf[Health]
    }
    
    extension [Self <: Health](x: Self) {
      
      inline def setHealth(value: Double): Self = StObject.set(x, "health", value.asInstanceOf[js.Any])
      
      inline def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      inline def setLatE6(value: Double): Self = StObject.set(x, "latE6", value.asInstanceOf[js.Any])
      
      inline def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      inline def setLngE6(value: Double): Self = StObject.set(x, "lngE6", value.asInstanceOf[js.Any])
      
      inline def setResCount(value: Double): Self = StObject.set(x, "resCount", value.asInstanceOf[js.Any])
      
      inline def setTeam(value: Double): Self = StObject.set(x, "team", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setType(value: portal_): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait In extends StObject {
    
    var in: js.Array[LinkGUID]
    
    var out: js.Array[LinkGUID]
  }
  object In {
    
    inline def apply(in: js.Array[LinkGUID], out: js.Array[LinkGUID]): In = {
      val __obj = js.Dynamic.literal(in = in.asInstanceOf[js.Any], out = out.asInstanceOf[js.Any])
      __obj.asInstanceOf[In]
    }
    
    extension [Self <: In](x: Self) {
      
      inline def setIn(value: js.Array[LinkGUID]): Self = StObject.set(x, "in", value.asInstanceOf[js.Any])
      
      inline def setInVarargs(value: LinkGUID*): Self = StObject.set(x, "in", js.Array(value*))
      
      inline def setOut(value: js.Array[LinkGUID]): Self = StObject.set(x, "out", value.asInstanceOf[js.Any])
      
      inline def setOutVarargs(value: LinkGUID*): Self = StObject.set(x, "out", js.Array(value*))
    }
  }
  
  trait LatE6 extends StObject {
    
    var guid: String
    
    var latE6: Double
    
    var lngE6: Double
  }
  object LatE6 {
    
    inline def apply(guid: String, latE6: Double, lngE6: Double): LatE6 = {
      val __obj = js.Dynamic.literal(guid = guid.asInstanceOf[js.Any], latE6 = latE6.asInstanceOf[js.Any], lngE6 = lngE6.asInstanceOf[js.Any])
      __obj.asInstanceOf[LatE6]
    }
    
    extension [Self <: LatE6](x: Self) {
      
      inline def setGuid(value: String): Self = StObject.set(x, "guid", value.asInstanceOf[js.Any])
      
      inline def setLatE6(value: Double): Self = StObject.set(x, "latE6", value.asInstanceOf[js.Any])
      
      inline def setLngE6(value: Double): Self = StObject.set(x, "lngE6", value.asInstanceOf[js.Any])
    }
  }
  
  trait Markup extends StObject {
    
    var markup: js.Array[MarkUpPortal | MarkUpPlayer | MarkUpText]
    
    var plextType: SYSTEM_BROADCAST | SYSTEM_NARROWCAST | PLAYER_GENERATED
    
    var team: RESISTANCE | ENLIGHTENED
    
    var text: String
  }
  object Markup {
    
    inline def apply(
      markup: js.Array[MarkUpPortal | MarkUpPlayer | MarkUpText],
      plextType: SYSTEM_BROADCAST | SYSTEM_NARROWCAST | PLAYER_GENERATED,
      team: RESISTANCE | ENLIGHTENED,
      text: String
    ): Markup = {
      val __obj = js.Dynamic.literal(markup = markup.asInstanceOf[js.Any], plextType = plextType.asInstanceOf[js.Any], team = team.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[Markup]
    }
    
    extension [Self <: Markup](x: Self) {
      
      inline def setMarkup(value: js.Array[MarkUpPortal | MarkUpPlayer | MarkUpText]): Self = StObject.set(x, "markup", value.asInstanceOf[js.Any])
      
      inline def setMarkupVarargs(value: (MarkUpPortal | MarkUpPlayer | MarkUpText)*): Self = StObject.set(x, "markup", js.Array(value*))
      
      inline def setPlextType(value: SYSTEM_BROADCAST | SYSTEM_NARROWCAST | PLAYER_GENERATED): Self = StObject.set(x, "plextType", value.asInstanceOf[js.Any])
      
      inline def setTeam(value: RESISTANCE | ENLIGHTENED): Self = StObject.set(x, "team", value.asInstanceOf[js.Any])
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
  
  trait SelectedPortalGuid extends StObject {
    
    var selectedPortalGuid: PortalGUID
  }
  object SelectedPortalGuid {
    
    inline def apply(selectedPortalGuid: PortalGUID): SelectedPortalGuid = {
      val __obj = js.Dynamic.literal(selectedPortalGuid = selectedPortalGuid.asInstanceOf[js.Any])
      __obj.asInstanceOf[SelectedPortalGuid]
    }
    
    extension [Self <: SelectedPortalGuid](x: Self) {
      
      inline def setSelectedPortalGuid(value: PortalGUID): Self = StObject.set(x, "selectedPortalGuid", value.asInstanceOf[js.Any])
    }
  }
}
