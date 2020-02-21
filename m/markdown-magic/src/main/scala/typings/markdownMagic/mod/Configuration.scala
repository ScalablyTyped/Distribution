package typings.markdownMagic.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Configuration extends js.Object {
  /**
    * set debug flag to true to inspect the process
    */
  var DEBUG: js.UndefOr[Boolean] = js.undefined
  /**
    * Comment pattern to look for & replace inner contents. Default AUTO-GENERATED-CONTENT
    */
  var matchWord: js.UndefOr[String] = js.undefined
  /**
    * Change output path of new content. Default behavior is replacing the original file
    */
  var outputDir: js.UndefOr[String] = js.undefined
  /**
    * Custom commands to transform block contents, see transforms & custom transforms sections below.
    */
  var transforms: js.UndefOr[StringDictionary[TransformFunction]] = js.undefined
}

object Configuration {
  @scala.inline
  def apply(
    DEBUG: js.UndefOr[Boolean] = js.undefined,
    matchWord: String = null,
    outputDir: String = null,
    transforms: StringDictionary[TransformFunction] = null
  ): Configuration = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(DEBUG)) __obj.updateDynamic("DEBUG")(DEBUG.asInstanceOf[js.Any])
    if (matchWord != null) __obj.updateDynamic("matchWord")(matchWord.asInstanceOf[js.Any])
    if (outputDir != null) __obj.updateDynamic("outputDir")(outputDir.asInstanceOf[js.Any])
    if (transforms != null) __obj.updateDynamic("transforms")(transforms.asInstanceOf[js.Any])
    __obj.asInstanceOf[Configuration]
  }
}

