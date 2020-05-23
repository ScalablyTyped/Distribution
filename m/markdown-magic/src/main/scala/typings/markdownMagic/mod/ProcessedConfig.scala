package typings.markdownMagic.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProcessedConfig extends Configuration {
  val originalPath: String
  val outputContent: String
  @JSName("outputDir")
  val outputDir_ProcessedConfig: String
  val outputFilePath: String
}

object ProcessedConfig {
  @scala.inline
  def apply(
    originalPath: String,
    outputContent: String,
    outputDir: String,
    outputFilePath: String,
    DEBUG: js.UndefOr[Boolean] = js.undefined,
    matchWord: String = null,
    transforms: StringDictionary[TransformFunction] = null
  ): ProcessedConfig = {
    val __obj = js.Dynamic.literal(originalPath = originalPath.asInstanceOf[js.Any], outputContent = outputContent.asInstanceOf[js.Any], outputDir = outputDir.asInstanceOf[js.Any], outputFilePath = outputFilePath.asInstanceOf[js.Any])
    if (!js.isUndefined(DEBUG)) __obj.updateDynamic("DEBUG")(DEBUG.get.asInstanceOf[js.Any])
    if (matchWord != null) __obj.updateDynamic("matchWord")(matchWord.asInstanceOf[js.Any])
    if (transforms != null) __obj.updateDynamic("transforms")(transforms.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcessedConfig]
  }
}

