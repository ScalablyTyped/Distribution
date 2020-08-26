package typings.googleapis.v32Mod.dfareportingV32

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Floodlight Activity GenerateTag Response
  */
@js.native
trait SchemaFloodlightActivitiesGenerateTagResponse extends js.Object {
  /**
    * Generated tag for this Floodlight activity. For global site tags, this is
    * the event snippet.
    */
  var floodlightActivityTag: js.UndefOr[String] = js.native
  /**
    * The global snippet section of a global site tag. The global site tag sets
    * new cookies on your domain, which will store a unique identifier for a
    * user or the ad click that brought the user to your site. Learn more.
    */
  var globalSiteTagGlobalSnippet: js.UndefOr[String] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#floodlightActivitiesGenerateTagResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
}

object SchemaFloodlightActivitiesGenerateTagResponse {
  @scala.inline
  def apply(): SchemaFloodlightActivitiesGenerateTagResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFloodlightActivitiesGenerateTagResponse]
  }
  @scala.inline
  implicit class SchemaFloodlightActivitiesGenerateTagResponseOps[Self <: SchemaFloodlightActivitiesGenerateTagResponse] (val x: Self) extends AnyVal {
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
    def setFloodlightActivityTag(value: String): Self = this.set("floodlightActivityTag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFloodlightActivityTag: Self = this.set("floodlightActivityTag", js.undefined)
    @scala.inline
    def setGlobalSiteTagGlobalSnippet(value: String): Self = this.set("globalSiteTagGlobalSnippet", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGlobalSiteTagGlobalSnippet: Self = this.set("globalSiteTagGlobalSnippet", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
  }
  
}

