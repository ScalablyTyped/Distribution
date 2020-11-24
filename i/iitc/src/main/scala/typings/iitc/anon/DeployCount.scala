package typings.iitc.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeployCount extends js.Object {
  
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
  implicit class DeployCountOps[Self <: DeployCount] (val x: Self) extends AnyVal {
    
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
    def setCaptureAp(value: Double): Self = this.set("captureAp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeployCount(value: Double): Self = this.set("deployCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestroyAp(value: Double): Self = this.set("destroyAp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnemyAp(value: Double): Self = this.set("enemyAp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFriendlyAp(value: Double): Self = this.set("friendlyAp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResoAp(value: Double): Self = this.set("resoAp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpgradeCount(value: Double): Self = this.set("upgradeCount", value.asInstanceOf[js.Any])
  }
}
