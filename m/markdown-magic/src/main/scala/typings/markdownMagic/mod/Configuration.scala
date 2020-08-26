package typings.markdownMagic.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Configuration extends js.Object {
  /**
    * set debug flag to true to inspect the process
    */
  var DEBUG: js.UndefOr[Boolean] = js.native
  /**
    * Comment pattern to look for & replace inner contents. Default AUTO-GENERATED-CONTENT
    */
  var matchWord: js.UndefOr[String] = js.native
  /**
    * Change output path of new content. Default behavior is replacing the original file
    */
  var outputDir: js.UndefOr[String] = js.native
  /**
    * Custom commands to transform block contents, see transforms & custom transforms sections below.
    */
  var transforms: js.UndefOr[StringDictionary[TransformFunction]] = js.native
}

object Configuration {
  @scala.inline
  def apply(): Configuration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Configuration]
  }
  @scala.inline
  implicit class ConfigurationOps[Self <: Configuration] (val x: Self) extends AnyVal {
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
    def setDEBUG(value: Boolean): Self = this.set("DEBUG", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDEBUG: Self = this.set("DEBUG", js.undefined)
    @scala.inline
    def setMatchWord(value: String): Self = this.set("matchWord", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMatchWord: Self = this.set("matchWord", js.undefined)
    @scala.inline
    def setOutputDir(value: String): Self = this.set("outputDir", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutputDir: Self = this.set("outputDir", js.undefined)
    @scala.inline
    def setTransforms(value: StringDictionary[TransformFunction]): Self = this.set("transforms", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransforms: Self = this.set("transforms", js.undefined)
  }
  
}

