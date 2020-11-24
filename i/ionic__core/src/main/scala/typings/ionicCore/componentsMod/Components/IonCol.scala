package typings.ionicCore.componentsMod.Components

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IonCol extends js.Object {
  
  /**
    * The amount to offset the column, in terms of how many columns it should shift to the end of the total available.
    */
  var offset: js.UndefOr[String] = js.native
  
  /**
    * The amount to offset the column for lg screens, in terms of how many columns it should shift to the end of the total available.
    */
  var offsetLg: js.UndefOr[String] = js.native
  
  /**
    * The amount to offset the column for md screens, in terms of how many columns it should shift to the end of the total available.
    */
  var offsetMd: js.UndefOr[String] = js.native
  
  /**
    * The amount to offset the column for sm screens, in terms of how many columns it should shift to the end of the total available.
    */
  var offsetSm: js.UndefOr[String] = js.native
  
  /**
    * The amount to offset the column for xl screens, in terms of how many columns it should shift to the end of the total available.
    */
  var offsetXl: js.UndefOr[String] = js.native
  
  /**
    * The amount to offset the column for xs screens, in terms of how many columns it should shift to the end of the total available.
    */
  var offsetXs: js.UndefOr[String] = js.native
  
  /**
    * The amount to pull the column, in terms of how many columns it should shift to the start of the total available.
    */
  var pull: js.UndefOr[String] = js.native
  
  /**
    * The amount to pull the column for lg screens, in terms of how many columns it should shift to the start of the total available.
    */
  var pullLg: js.UndefOr[String] = js.native
  
  /**
    * The amount to pull the column for md screens, in terms of how many columns it should shift to the start of the total available.
    */
  var pullMd: js.UndefOr[String] = js.native
  
  /**
    * The amount to pull the column for sm screens, in terms of how many columns it should shift to the start of the total available.
    */
  var pullSm: js.UndefOr[String] = js.native
  
  /**
    * The amount to pull the column for xl screens, in terms of how many columns it should shift to the start of the total available.
    */
  var pullXl: js.UndefOr[String] = js.native
  
  /**
    * The amount to pull the column for xs screens, in terms of how many columns it should shift to the start of the total available.
    */
  var pullXs: js.UndefOr[String] = js.native
  
  /**
    * The amount to push the column, in terms of how many columns it should shift to the end of the total available.
    */
  var push: js.UndefOr[String] = js.native
  
  /**
    * The amount to push the column for lg screens, in terms of how many columns it should shift to the end of the total available.
    */
  var pushLg: js.UndefOr[String] = js.native
  
  /**
    * The amount to push the column for md screens, in terms of how many columns it should shift to the end of the total available.
    */
  var pushMd: js.UndefOr[String] = js.native
  
  /**
    * The amount to push the column for sm screens, in terms of how many columns it should shift to the end of the total available.
    */
  var pushSm: js.UndefOr[String] = js.native
  
  /**
    * The amount to push the column for xl screens, in terms of how many columns it should shift to the end of the total available.
    */
  var pushXl: js.UndefOr[String] = js.native
  
  /**
    * The amount to push the column for xs screens, in terms of how many columns it should shift to the end of the total available.
    */
  var pushXs: js.UndefOr[String] = js.native
  
  /**
    * The size of the column, in terms of how many columns it should take up out of the total available. If `"auto"` is passed, the column will be the size of its content.
    */
  var size: js.UndefOr[String] = js.native
  
  /**
    * The size of the column for lg screens, in terms of how many columns it should take up out of the total available. If `"auto"` is passed, the column will be the size of its content.
    */
  var sizeLg: js.UndefOr[String] = js.native
  
  /**
    * The size of the column for md screens, in terms of how many columns it should take up out of the total available. If `"auto"` is passed, the column will be the size of its content.
    */
  var sizeMd: js.UndefOr[String] = js.native
  
  /**
    * The size of the column for sm screens, in terms of how many columns it should take up out of the total available. If `"auto"` is passed, the column will be the size of its content.
    */
  var sizeSm: js.UndefOr[String] = js.native
  
  /**
    * The size of the column for xl screens, in terms of how many columns it should take up out of the total available. If `"auto"` is passed, the column will be the size of its content.
    */
  var sizeXl: js.UndefOr[String] = js.native
  
  /**
    * The size of the column for xs screens, in terms of how many columns it should take up out of the total available. If `"auto"` is passed, the column will be the size of its content.
    */
  var sizeXs: js.UndefOr[String] = js.native
}
object IonCol {
  
  @scala.inline
  def apply(): IonCol = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IonCol]
  }
  
  @scala.inline
  implicit class IonColOps[Self <: IonCol] (val x: Self) extends AnyVal {
    
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
    def setOffset(value: String): Self = this.set("offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    
    @scala.inline
    def setOffsetLg(value: String): Self = this.set("offsetLg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffsetLg: Self = this.set("offsetLg", js.undefined)
    
    @scala.inline
    def setOffsetMd(value: String): Self = this.set("offsetMd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffsetMd: Self = this.set("offsetMd", js.undefined)
    
    @scala.inline
    def setOffsetSm(value: String): Self = this.set("offsetSm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffsetSm: Self = this.set("offsetSm", js.undefined)
    
    @scala.inline
    def setOffsetXl(value: String): Self = this.set("offsetXl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffsetXl: Self = this.set("offsetXl", js.undefined)
    
    @scala.inline
    def setOffsetXs(value: String): Self = this.set("offsetXs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffsetXs: Self = this.set("offsetXs", js.undefined)
    
    @scala.inline
    def setPull(value: String): Self = this.set("pull", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePull: Self = this.set("pull", js.undefined)
    
    @scala.inline
    def setPullLg(value: String): Self = this.set("pullLg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePullLg: Self = this.set("pullLg", js.undefined)
    
    @scala.inline
    def setPullMd(value: String): Self = this.set("pullMd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePullMd: Self = this.set("pullMd", js.undefined)
    
    @scala.inline
    def setPullSm(value: String): Self = this.set("pullSm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePullSm: Self = this.set("pullSm", js.undefined)
    
    @scala.inline
    def setPullXl(value: String): Self = this.set("pullXl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePullXl: Self = this.set("pullXl", js.undefined)
    
    @scala.inline
    def setPullXs(value: String): Self = this.set("pullXs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePullXs: Self = this.set("pullXs", js.undefined)
    
    @scala.inline
    def setPush(value: String): Self = this.set("push", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePush: Self = this.set("push", js.undefined)
    
    @scala.inline
    def setPushLg(value: String): Self = this.set("pushLg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePushLg: Self = this.set("pushLg", js.undefined)
    
    @scala.inline
    def setPushMd(value: String): Self = this.set("pushMd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePushMd: Self = this.set("pushMd", js.undefined)
    
    @scala.inline
    def setPushSm(value: String): Self = this.set("pushSm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePushSm: Self = this.set("pushSm", js.undefined)
    
    @scala.inline
    def setPushXl(value: String): Self = this.set("pushXl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePushXl: Self = this.set("pushXl", js.undefined)
    
    @scala.inline
    def setPushXs(value: String): Self = this.set("pushXs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePushXs: Self = this.set("pushXs", js.undefined)
    
    @scala.inline
    def setSize(value: String): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    
    @scala.inline
    def setSizeLg(value: String): Self = this.set("sizeLg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSizeLg: Self = this.set("sizeLg", js.undefined)
    
    @scala.inline
    def setSizeMd(value: String): Self = this.set("sizeMd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSizeMd: Self = this.set("sizeMd", js.undefined)
    
    @scala.inline
    def setSizeSm(value: String): Self = this.set("sizeSm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSizeSm: Self = this.set("sizeSm", js.undefined)
    
    @scala.inline
    def setSizeXl(value: String): Self = this.set("sizeXl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSizeXl: Self = this.set("sizeXl", js.undefined)
    
    @scala.inline
    def setSizeXs(value: String): Self = this.set("sizeXs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSizeXs: Self = this.set("sizeXs", js.undefined)
  }
}
