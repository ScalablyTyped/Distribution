package typings.hermesProfileTransformer

import typings.hermesProfileTransformer.distTypesEventInterfacesMod.DurationEvent
import typings.hermesProfileTransformer.distTypesSourceMapMod.SourceMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distProfilerApplySourceMapsToEventsMod {
  
  @JSImport("hermes-profile-transformer/dist/profiler/applySourceMapsToEvents", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
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
  inline def default(sourceMap: SourceMap, chromeEvents: js.Array[DurationEvent]): js.Promise[js.Array[DurationEvent]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(sourceMap.asInstanceOf[js.Any], chromeEvents.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[DurationEvent]]]
  inline def default(sourceMap: SourceMap, chromeEvents: js.Array[DurationEvent], indexBundleFileName: String): js.Promise[js.Array[DurationEvent]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(sourceMap.asInstanceOf[js.Any], chromeEvents.asInstanceOf[js.Any], indexBundleFileName.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[DurationEvent]]]
}
