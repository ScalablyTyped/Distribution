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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Attackfrequency extends StObject {
    
    var attack_frequency: Double = js.native
    
    var force_amplifier: Double = js.native
    
    var hit_bonus: Double = js.native
  }
  object Attackfrequency {
    
    @scala.inline
    def apply(attack_frequency: Double, force_amplifier: Double, hit_bonus: Double): Attackfrequency = {
      val __obj = js.Dynamic.literal(attack_frequency = attack_frequency.asInstanceOf[js.Any], force_amplifier = force_amplifier.asInstanceOf[js.Any], hit_bonus = hit_bonus.asInstanceOf[js.Any])
      __obj.asInstanceOf[Attackfrequency]
    }
    
    @scala.inline
    implicit class AttackfrequencyMutableBuilder[Self <: Attackfrequency] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttack_frequency(value: Double): Self = StObject.set(x, "attack_frequency", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForce_amplifier(value: Double): Self = StObject.set(x, "force_amplifier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHit_bonus(value: Double): Self = StObject.set(x, "hit_bonus", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Burnout extends StObject {
    
    var burnout: Double = js.native
    
    var cooldown: Double = js.native
    
    var hacks: Double = js.native
  }
  object Burnout {
    
    @scala.inline
    def apply(burnout: Double, cooldown: Double, hacks: Double): Burnout = {
      val __obj = js.Dynamic.literal(burnout = burnout.asInstanceOf[js.Any], cooldown = cooldown.asInstanceOf[js.Any], hacks = hacks.asInstanceOf[js.Any])
      __obj.asInstanceOf[Burnout]
    }
    
    @scala.inline
    implicit class BurnoutMutableBuilder[Self <: Burnout] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBurnout(value: Double): Self = StObject.set(x, "burnout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCooldown(value: Double): Self = StObject.set(x, "cooldown", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHacks(value: Double): Self = StObject.set(x, "hacks", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait CaptureAp extends StObject {
    
    var captureAp: Double = js.native
    
    var destroyAp: Double = js.native
    
    var destroyResoAp: Double = js.native
    
    var enemyAp: Double = js.native
    
    var friendlyAp: Double = js.native
  }
  object CaptureAp {
    
    @scala.inline
    def apply(captureAp: Double, destroyAp: Double, destroyResoAp: Double, enemyAp: Double, friendlyAp: Double): CaptureAp = {
      val __obj = js.Dynamic.literal(captureAp = captureAp.asInstanceOf[js.Any], destroyAp = destroyAp.asInstanceOf[js.Any], destroyResoAp = destroyResoAp.asInstanceOf[js.Any], enemyAp = enemyAp.asInstanceOf[js.Any], friendlyAp = friendlyAp.asInstanceOf[js.Any])
      __obj.asInstanceOf[CaptureAp]
    }
    
    @scala.inline
    implicit class CaptureApMutableBuilder[Self <: CaptureAp] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCaptureAp(value: Double): Self = StObject.set(x, "captureAp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDestroyAp(value: Double): Self = StObject.set(x, "destroyAp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDestroyResoAp(value: Double): Self = StObject.set(x, "destroyResoAp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnemyAp(value: Double): Self = StObject.set(x, "enemyAp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFriendlyAp(value: Double): Self = StObject.set(x, "friendlyAp", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DeployCount extends StObject {
    
    var captureAp: Double = js.native
    
    var deployCount: Double = js.native
    
    var destroyAp: Double = js.native
    
    var enemyAp: Double = js.native
    
    var friendlyAp: Double = js.native
    
    var resoAp: Double = js.native
    
    var upgradeCount: Double = js.native
  }
  object DeployCount {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class DeployCountMutableBuilder[Self <: DeployCount] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCaptureAp(value: Double): Self = StObject.set(x, "captureAp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeployCount(value: Double): Self = StObject.set(x, "deployCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDestroyAp(value: Double): Self = StObject.set(x, "destroyAp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnemyAp(value: Double): Self = StObject.set(x, "enemyAp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFriendlyAp(value: Double): Self = StObject.set(x, "friendlyAp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResoAp(value: Double): Self = StObject.set(x, "resoAp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpgradeCount(value: Double): Self = StObject.set(x, "upgradeCount", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Details extends EventPortalDetailLoaded {
    
    var details: PortalDataDetail = js.native
    
    var ent: PortalDetailEnt = js.native
    
    var guid: String = js.native
    
    var success: `true` = js.native
  }
  object Details {
    
    @scala.inline
    def apply(details: PortalDataDetail, ent: PortalDetailEnt, guid: String, success: `true`): Details = {
      val __obj = js.Dynamic.literal(details = details.asInstanceOf[js.Any], ent = ent.asInstanceOf[js.Any], guid = guid.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
      __obj.asInstanceOf[Details]
    }
    
    @scala.inline
    implicit class DetailsMutableBuilder[Self <: Details] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDetails(value: PortalDataDetail): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnt(value: PortalDetailEnt): Self = StObject.set(x, "ent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGuid(value: String): Self = StObject.set(x, "guid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuccess(value: `true`): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Excess extends StObject {
    
    var excess: Double = js.native
    
    var linkDefenseBoost: Double = js.native
    
    var links: Double = js.native
    
    var shields: Double = js.native
  }
  object Excess {
    
    @scala.inline
    def apply(excess: Double, linkDefenseBoost: Double, links: Double, shields: Double): Excess = {
      val __obj = js.Dynamic.literal(excess = excess.asInstanceOf[js.Any], linkDefenseBoost = linkDefenseBoost.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], shields = shields.asInstanceOf[js.Any])
      __obj.asInstanceOf[Excess]
    }
    
    @scala.inline
    implicit class ExcessMutableBuilder[Self <: Excess] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExcess(value: Double): Self = StObject.set(x, "excess", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLinkDefenseBoost(value: Double): Self = StObject.set(x, "linkDefenseBoost", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLinks(value: Double): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShields(value: Double): Self = StObject.set(x, "shields", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Fragment extends StObject {
    
    var fragment: js.Any = js.native
    
    var target: js.Any = js.native
  }
  object Fragment {
    
    @scala.inline
    def apply(fragment: js.Any, target: js.Any): Fragment = {
      val __obj = js.Dynamic.literal(fragment = fragment.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[Fragment]
    }
    
    @scala.inline
    implicit class FragmentMutableBuilder[Self <: Fragment] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFragment(value: js.Any): Self = StObject.set(x, "fragment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTarget(value: js.Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Guid extends EventPortalDetailLoaded {
    
    var guid: String = js.native
    
    var success: `false` = js.native
  }
  object Guid {
    
    @scala.inline
    def apply(guid: String, success: `false`): Guid = {
      val __obj = js.Dynamic.literal(guid = guid.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
      __obj.asInstanceOf[Guid]
    }
    
    @scala.inline
    implicit class GuidMutableBuilder[Self <: Guid] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGuid(value: String): Self = StObject.set(x, "guid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuccess(value: `false`): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Health extends StObject {
    
    var health: Double = js.native
    
    var image: String = js.native
    
    var latE6: Double = js.native
    
    var level: Double = js.native
    
    var lngE6: Double = js.native
    
    var resCount: Double = js.native
    
    var team: Double = js.native
    
    var title: String = js.native
    
    var `type`: portal_ = js.native
  }
  object Health {
    
    @scala.inline
    def apply(
      health: Double,
      image: String,
      latE6: Double,
      level: Double,
      lngE6: Double,
      resCount: Double,
      team: Double,
      title: String,
      `type`: portal_
    ): Health = {
      val __obj = js.Dynamic.literal(health = health.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], latE6 = latE6.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], lngE6 = lngE6.asInstanceOf[js.Any], resCount = resCount.asInstanceOf[js.Any], team = team.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Health]
    }
    
    @scala.inline
    implicit class HealthMutableBuilder[Self <: Health] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHealth(value: Double): Self = StObject.set(x, "health", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLatE6(value: Double): Self = StObject.set(x, "latE6", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLngE6(value: Double): Self = StObject.set(x, "lngE6", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResCount(value: Double): Self = StObject.set(x, "resCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTeam(value: Double): Self = StObject.set(x, "team", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: portal_): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait In extends StObject {
    
    var in: js.Array[LinkGUID] = js.native
    
    var out: js.Array[LinkGUID] = js.native
  }
  object In {
    
    @scala.inline
    def apply(in: js.Array[LinkGUID], out: js.Array[LinkGUID]): In = {
      val __obj = js.Dynamic.literal(in = in.asInstanceOf[js.Any], out = out.asInstanceOf[js.Any])
      __obj.asInstanceOf[In]
    }
    
    @scala.inline
    implicit class InMutableBuilder[Self <: In] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIn(value: js.Array[LinkGUID]): Self = StObject.set(x, "in", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInVarargs(value: LinkGUID*): Self = StObject.set(x, "in", js.Array(value :_*))
      
      @scala.inline
      def setOut(value: js.Array[LinkGUID]): Self = StObject.set(x, "out", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutVarargs(value: LinkGUID*): Self = StObject.set(x, "out", js.Array(value :_*))
    }
  }
  
  @js.native
  trait LatE6 extends StObject {
    
    var guid: String = js.native
    
    var latE6: Double = js.native
    
    var lngE6: Double = js.native
  }
  object LatE6 {
    
    @scala.inline
    def apply(guid: String, latE6: Double, lngE6: Double): LatE6 = {
      val __obj = js.Dynamic.literal(guid = guid.asInstanceOf[js.Any], latE6 = latE6.asInstanceOf[js.Any], lngE6 = lngE6.asInstanceOf[js.Any])
      __obj.asInstanceOf[LatE6]
    }
    
    @scala.inline
    implicit class LatE6MutableBuilder[Self <: LatE6] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGuid(value: String): Self = StObject.set(x, "guid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLatE6(value: Double): Self = StObject.set(x, "latE6", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLngE6(value: Double): Self = StObject.set(x, "lngE6", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Markup extends StObject {
    
    var markup: js.Array[MarkUpPortal | MarkUpPlayer | MarkUpText] = js.native
    
    var plextType: SYSTEM_BROADCAST | SYSTEM_NARROWCAST | PLAYER_GENERATED = js.native
    
    var team: RESISTANCE | ENLIGHTENED = js.native
    
    var text: String = js.native
  }
  object Markup {
    
    @scala.inline
    def apply(
      markup: js.Array[MarkUpPortal | MarkUpPlayer | MarkUpText],
      plextType: SYSTEM_BROADCAST | SYSTEM_NARROWCAST | PLAYER_GENERATED,
      team: RESISTANCE | ENLIGHTENED,
      text: String
    ): Markup = {
      val __obj = js.Dynamic.literal(markup = markup.asInstanceOf[js.Any], plextType = plextType.asInstanceOf[js.Any], team = team.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[Markup]
    }
    
    @scala.inline
    implicit class MarkupMutableBuilder[Self <: Markup] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMarkup(value: js.Array[MarkUpPortal | MarkUpPlayer | MarkUpText]): Self = StObject.set(x, "markup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarkupVarargs(value: (MarkUpPortal | MarkUpPlayer | MarkUpText)*): Self = StObject.set(x, "markup", js.Array(value :_*))
      
      @scala.inline
      def setPlextType(value: SYSTEM_BROADCAST | SYSTEM_NARROWCAST | PLAYER_GENERATED): Self = StObject.set(x, "plextType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTeam(value: RESISTANCE | ENLIGHTENED): Self = StObject.set(x, "team", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SelectedPortalGuid extends StObject {
    
    var selectedPortalGuid: PortalGUID = js.native
  }
  object SelectedPortalGuid {
    
    @scala.inline
    def apply(selectedPortalGuid: PortalGUID): SelectedPortalGuid = {
      val __obj = js.Dynamic.literal(selectedPortalGuid = selectedPortalGuid.asInstanceOf[js.Any])
      __obj.asInstanceOf[SelectedPortalGuid]
    }
    
    @scala.inline
    implicit class SelectedPortalGuidMutableBuilder[Self <: SelectedPortalGuid] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSelectedPortalGuid(value: PortalGUID): Self = StObject.set(x, "selectedPortalGuid", value.asInstanceOf[js.Any])
    }
  }
}
