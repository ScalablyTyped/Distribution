package typings.hermesProfileTransformer

import typings.hermesProfileTransformer.eventInterfacesMod.DurationEvent
import typings.hermesProfileTransformer.sourceMapMod.SourceMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("hermes-profile-transformer/dist/profiler/applySourceMapsToEvents", JSImport.Namespace)
@js.native
object applySourceMapsToEventsMod extends js.Object {
  
  /**
    * Enhances the function line, column and params information and event categories
    * based on JavaScript source maps to make it easier to associate trace events with
    * the application code
    *
    * Throws error if args not set up in ChromeEvents
    * @param {SourceMap} sourceMap
    * @param {DurationEvent[]} chromeEvents
    * @param {string} indexBundleFileName
    * @throws If `args` for events are not populated
    * @returns {DurationEvent[]}
    */
  def default(sourceMap: SourceMap, chromeEvents: js.Array[DurationEvent]): js.Promise[js.Array[DurationEvent]] = js.native
  def default(sourceMap: SourceMap, chromeEvents: js.Array[DurationEvent], indexBundleFileName: String): js.Promise[js.Array[DurationEvent]] = js.native
}
