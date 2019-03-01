package typings
package htmlDashWebpackDashPluginLib.htmlDashWebpackDashPluginMod.HtmlWebpackPluginNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Hooks
  extends webpackLib.webpackMod.webpackNs.compilationNs.CompilationHooks {
  var htmlWebpackPluginAfterEmit: tapableLib.tapableMod.AsyncSeriesWaterfallHook[htmlDashWebpackDashPluginLib.Anon_Html, _, _]
  var htmlWebpackPluginAfterHtmlProcessing: tapableLib.tapableMod.AsyncSeriesWaterfallHook[htmlDashWebpackDashPluginLib.Anon_AssetsHtml, _, _]
  var htmlWebpackPluginAlterAssetTags: tapableLib.tapableMod.AsyncSeriesWaterfallHook[htmlDashWebpackDashPluginLib.Anon_Body, _, _]
  var htmlWebpackPluginBeforeHtmlGeneration: tapableLib.tapableMod.AsyncSeriesWaterfallHook[htmlDashWebpackDashPluginLib.Anon_Assets, _, _]
  var htmlWebpackPluginBeforeHtmlProcessing: tapableLib.tapableMod.AsyncSeriesWaterfallHook[htmlDashWebpackDashPluginLib.Anon_AssetsHtml, _, _]
}

object Hooks {
  @scala.inline
  def apply(
    additionalAssets: tapableLib.tapableMod.AsyncSeriesHook[_, _, _],
    additionalChunkAssets: tapableLib.tapableMod.SyncHook[js.Array[webpackLib.webpackMod.webpackNs.compilationNs.Chunk], _, _],
    advancedOptimizeModuleOrder: tapableLib.tapableMod.SyncHook[js.Array[webpackLib.webpackMod.webpackNs.compilationNs.Module], _, _],
    afterHash: tapableLib.tapableMod.SyncHook[_, _, _],
    afterOptimizeAssets: tapableLib.tapableMod.SyncHook[js.Array[webpackLib.webpackMod.webpackNs.compilationNs.Asset], _, _],
    afterOptimizeChunkAssets: tapableLib.tapableMod.SyncHook[js.Array[webpackLib.webpackMod.webpackNs.compilationNs.Chunk], _, _],
    afterOptimizeChunkIds: tapableLib.tapableMod.SyncHook[js.Array[webpackLib.webpackMod.webpackNs.compilationNs.Chunk], _, _],
    afterOptimizeChunkModules: tapableLib.tapableMod.SyncHook[
      js.Array[webpackLib.webpackMod.webpackNs.compilationNs.Chunk], 
      js.Array[webpackLib.webpackMod.webpackNs.compilationNs.Module], 
      _
    ],
    afterOptimizeChunks: tapableLib.tapableMod.SyncHook[
      js.Array[webpackLib.webpackMod.webpackNs.compilationNs.Chunk], 
      js.Array[webpackLib.webpackMod.webpackNs.compilationNs.ChunkGroup], 
      _
    ],
    afterOptimizeDependencies: tapableLib.tapableMod.SyncHook[js.Array[webpackLib.webpackMod.webpackNs.compilationNs.Module], _, _],
    afterOptimizeExtractedChunks: tapableLib.tapableMod.SyncHook[js.Array[webpackLib.webpackMod.webpackNs.compilationNs.Chunk], _, _],
    afterOptimizeModuleIds: tapableLib.tapableMod.SyncHook[js.Array[webpackLib.webpackMod.webpackNs.compilationNs.Module], _, _],
    afterOptimizeModules: tapableLib.tapableMod.SyncHook[js.Array[webpackLib.webpackMod.webpackNs.compilationNs.Module], _, _],
    afterOptimizeTree: tapableLib.tapableMod.SyncHook[
      js.Array[webpackLib.webpackMod.webpackNs.compilationNs.Chunk], 
      js.Array[webpackLib.webpackMod.webpackNs.compilationNs.Module], 
      _
    ],
    afterSeal: tapableLib.tapableMod.AsyncSeriesHook[_, _, _],
    assetPath: tapableLib.tapableMod.SyncWaterfallHook[java.lang.String, _, _],
    beforeChunkAssets: tapableLib.tapableMod.SyncHook[_, _, _],
    beforeChunkIds: tapableLib.tapableMod.SyncHook[js.Array[webpackLib.webpackMod.webpackNs.compilationNs.Chunk], _, _],
    beforeHash: tapableLib.tapableMod.SyncHook[_, _, _],
    beforeModuleAssets: tapableLib.tapableMod.SyncHook[_, _, _],
    beforeModuleIds: tapableLib.tapableMod.SyncHook[js.Array[webpackLib.webpackMod.webpackNs.compilationNs.Module], _, _],
    buildModule: tapableLib.tapableMod.SyncHook[webpackLib.webpackMod.webpackNs.compilationNs.Module, _, _],
    childCompiler: tapableLib.tapableMod.SyncHook[_, _, _],
    chunkAsset: tapableLib.tapableMod.SyncHook[webpackLib.webpackMod.webpackNs.compilationNs.Chunk, java.lang.String, _],
    chunkHash: tapableLib.tapableMod.SyncHook[
      webpackLib.webpackMod.webpackNs.compilationNs.Chunk, 
      webpackLib.webpackMod.webpackNs.compilationNs.ChunkHash, 
      _
    ],
    failedModule: tapableLib.tapableMod.SyncHook[webpackLib.webpackMod.webpackNs.compilationNs.Module, nodeLib.Error, _],
    finishModules: tapableLib.tapableMod.SyncHook[js.Array[webpackLib.webpackMod.webpackNs.compilationNs.Module], _, _],
    finishRebuildingModule: tapableLib.tapableMod.SyncHook[webpackLib.webpackMod.webpackNs.compilationNs.Module, _, _],
    htmlWebpackPluginAfterEmit: tapableLib.tapableMod.AsyncSeriesWaterfallHook[htmlDashWebpackDashPluginLib.Anon_Html, _, _],
    htmlWebpackPluginAfterHtmlProcessing: tapableLib.tapableMod.AsyncSeriesWaterfallHook[htmlDashWebpackDashPluginLib.Anon_AssetsHtml, _, _],
    htmlWebpackPluginAlterAssetTags: tapableLib.tapableMod.AsyncSeriesWaterfallHook[htmlDashWebpackDashPluginLib.Anon_Body, _, _],
    htmlWebpackPluginBeforeHtmlGeneration: tapableLib.tapableMod.AsyncSeriesWaterfallHook[htmlDashWebpackDashPluginLib.Anon_Assets, _, _],
    htmlWebpackPluginBeforeHtmlProcessing: tapableLib.tapableMod.AsyncSeriesWaterfallHook[htmlDashWebpackDashPluginLib.Anon_AssetsHtml, _, _],
    moduleAsset: tapableLib.tapableMod.SyncHook[webpackLib.webpackMod.webpackNs.compilationNs.Module, java.lang.String, _],
    moduleIds: tapableLib.tapableMod.SyncHook[js.Array[webpackLib.webpackMod.webpackNs.compilationNs.Module], _, _],
    needAdditionalPass: tapableLib.tapableMod.SyncBailHook[_, _, _, _],
    needAdditionalSeal: tapableLib.tapableMod.SyncBailHook[_, _, _, _],
    normalModuleLoader: tapableLib.tapableMod.SyncHook[_, webpackLib.webpackMod.webpackNs.compilationNs.Module, _],
    optimize: tapableLib.tapableMod.SyncHook[_, _, _],
    optimizeAssets: tapableLib.tapableMod.AsyncSeriesHook[js.Array[webpackLib.webpackMod.webpackNs.compilationNs.Asset], _, _],
    optimizeChunkAssets: tapableLib.tapableMod.AsyncSeriesHook[js.Array[webpackLib.webpackMod.webpackNs.compilationNs.Chunk], _, _],
    optimizeChunkIds: tapableLib.tapableMod.SyncHook[js.Array[webpackLib.webpackMod.webpackNs.compilationNs.Chunk], _, _],
    optimizeChunkModules: tapableLib.tapableMod.SyncBailHook[
      js.Array[webpackLib.webpackMod.webpackNs.compilationNs.Chunk], 
      js.Array[webpackLib.webpackMod.webpackNs.compilationNs.Module], 
      _, 
      _
    ],
    optimizeChunkModulesAdvanced: tapableLib.tapableMod.SyncBailHook[
      js.Array[webpackLib.webpackMod.webpackNs.compilationNs.Chunk], 
      js.Array[webpackLib.webpackMod.webpackNs.compilationNs.Module], 
      _, 
      _
    ],
    optimizeChunkModulesBasic: tapableLib.tapableMod.SyncBailHook[
      js.Array[webpackLib.webpackMod.webpackNs.compilationNs.Chunk], 
      js.Array[webpackLib.webpackMod.webpackNs.compilationNs.Module], 
      _, 
      _
    ],
    optimizeChunkOrder: tapableLib.tapableMod.SyncHook[js.Array[webpackLib.webpackMod.webpackNs.compilationNs.Chunk], _, _],
    optimizeChunks: tapableLib.tapableMod.SyncBailHook[
      js.Array[webpackLib.webpackMod.webpackNs.compilationNs.Chunk], 
      js.Array[webpackLib.webpackMod.webpackNs.compilationNs.ChunkGroup], 
      _, 
      _
    ],
    optimizeChunksAdvanced: tapableLib.tapableMod.SyncBailHook[
      js.Array[webpackLib.webpackMod.webpackNs.compilationNs.Chunk], 
      js.Array[webpackLib.webpackMod.webpackNs.compilationNs.ChunkGroup], 
      _, 
      _
    ],
    optimizeChunksBasic: tapableLib.tapableMod.SyncBailHook[
      js.Array[webpackLib.webpackMod.webpackNs.compilationNs.Chunk], 
      js.Array[webpackLib.webpackMod.webpackNs.compilationNs.ChunkGroup], 
      _, 
      _
    ],
    optimizeDependencies: tapableLib.tapableMod.SyncBailHook[js.Array[webpackLib.webpackMod.webpackNs.compilationNs.Module], _, _, _],
    optimizeDependenciesAdvanced: tapableLib.tapableMod.SyncBailHook[js.Array[webpackLib.webpackMod.webpackNs.compilationNs.Module], _, _, _],
    optimizeDependenciesBasic: tapableLib.tapableMod.SyncBailHook[js.Array[webpackLib.webpackMod.webpackNs.compilationNs.Module], _, _, _],
    optimizeExtractedChunks: tapableLib.tapableMod.SyncBailHook[js.Array[webpackLib.webpackMod.webpackNs.compilationNs.Chunk], _, _, _],
    optimizeExtractedChunksAdvanced: tapableLib.tapableMod.SyncBailHook[js.Array[webpackLib.webpackMod.webpackNs.compilationNs.Chunk], _, _, _],
    optimizeExtractedChunksBasic: tapableLib.tapableMod.SyncBailHook[js.Array[webpackLib.webpackMod.webpackNs.compilationNs.Chunk], _, _, _],
    optimizeModuleIds: tapableLib.tapableMod.SyncHook[js.Array[webpackLib.webpackMod.webpackNs.compilationNs.Module], _, _],
    optimizeModuleOrder: tapableLib.tapableMod.SyncHook[js.Array[webpackLib.webpackMod.webpackNs.compilationNs.Module], _, _],
    optimizeModules: tapableLib.tapableMod.SyncBailHook[js.Array[webpackLib.webpackMod.webpackNs.compilationNs.Module], _, _, _],
    optimizeModulesAdvanced: tapableLib.tapableMod.SyncBailHook[js.Array[webpackLib.webpackMod.webpackNs.compilationNs.Module], _, _, _],
    optimizeModulesBasic: tapableLib.tapableMod.SyncBailHook[js.Array[webpackLib.webpackMod.webpackNs.compilationNs.Module], _, _, _],
    optimizeTree: tapableLib.tapableMod.AsyncSeriesHook[
      js.Array[webpackLib.webpackMod.webpackNs.compilationNs.Chunk], 
      js.Array[webpackLib.webpackMod.webpackNs.compilationNs.Module], 
      _
    ],
    rebuildModule: tapableLib.tapableMod.SyncHook[webpackLib.webpackMod.webpackNs.compilationNs.Module, _, _],
    record: tapableLib.tapableMod.SyncHook[
      webpackLib.webpackMod.webpackNs.compilationNs.Compilation, 
      js.Array[webpackLib.webpackMod.webpackNs.compilationNs.Record], 
      _
    ],
    recordChunks: tapableLib.tapableMod.SyncHook[
      js.Array[webpackLib.webpackMod.webpackNs.compilationNs.Chunk], 
      js.Array[webpackLib.webpackMod.webpackNs.compilationNs.Record], 
      _
    ],
    recordHash: tapableLib.tapableMod.SyncHook[js.Array[webpackLib.webpackMod.webpackNs.compilationNs.Record], _, _],
    recordModules: tapableLib.tapableMod.SyncHook[
      js.Array[webpackLib.webpackMod.webpackNs.compilationNs.Module], 
      js.Array[webpackLib.webpackMod.webpackNs.compilationNs.Record], 
      _
    ],
    records: tapableLib.tapableMod.SyncHook[
      webpackLib.webpackMod.webpackNs.compilationNs.Compilation, 
      js.Array[webpackLib.webpackMod.webpackNs.compilationNs.Record], 
      _
    ],
    reviveChunks: tapableLib.tapableMod.SyncHook[
      js.Array[webpackLib.webpackMod.webpackNs.compilationNs.Chunk], 
      js.Array[webpackLib.webpackMod.webpackNs.compilationNs.Record], 
      _
    ],
    reviveModules: tapableLib.tapableMod.SyncHook[
      js.Array[webpackLib.webpackMod.webpackNs.compilationNs.Module], 
      js.Array[webpackLib.webpackMod.webpackNs.compilationNs.Record], 
      _
    ],
    seal: tapableLib.tapableMod.SyncHook[_, _, _],
    shouldGenerateChunkAssets: tapableLib.tapableMod.SyncBailHook[_, _, _, _],
    shouldRecord: tapableLib.tapableMod.SyncBailHook[_, _, _, _],
    succeedModule: tapableLib.tapableMod.SyncHook[webpackLib.webpackMod.webpackNs.compilationNs.Module, _, _],
    unseal: tapableLib.tapableMod.SyncHook[_, _, _]
  ): Hooks = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("additionalAssets")(additionalAssets)
    __obj.updateDynamic("additionalChunkAssets")(additionalChunkAssets)
    __obj.updateDynamic("advancedOptimizeModuleOrder")(advancedOptimizeModuleOrder)
    __obj.updateDynamic("afterHash")(afterHash)
    __obj.updateDynamic("afterOptimizeAssets")(afterOptimizeAssets)
    __obj.updateDynamic("afterOptimizeChunkAssets")(afterOptimizeChunkAssets)
    __obj.updateDynamic("afterOptimizeChunkIds")(afterOptimizeChunkIds)
    __obj.updateDynamic("afterOptimizeChunkModules")(afterOptimizeChunkModules)
    __obj.updateDynamic("afterOptimizeChunks")(afterOptimizeChunks)
    __obj.updateDynamic("afterOptimizeDependencies")(afterOptimizeDependencies)
    __obj.updateDynamic("afterOptimizeExtractedChunks")(afterOptimizeExtractedChunks)
    __obj.updateDynamic("afterOptimizeModuleIds")(afterOptimizeModuleIds)
    __obj.updateDynamic("afterOptimizeModules")(afterOptimizeModules)
    __obj.updateDynamic("afterOptimizeTree")(afterOptimizeTree)
    __obj.updateDynamic("afterSeal")(afterSeal)
    __obj.updateDynamic("assetPath")(assetPath)
    __obj.updateDynamic("beforeChunkAssets")(beforeChunkAssets)
    __obj.updateDynamic("beforeChunkIds")(beforeChunkIds)
    __obj.updateDynamic("beforeHash")(beforeHash)
    __obj.updateDynamic("beforeModuleAssets")(beforeModuleAssets)
    __obj.updateDynamic("beforeModuleIds")(beforeModuleIds)
    __obj.updateDynamic("buildModule")(buildModule)
    __obj.updateDynamic("childCompiler")(childCompiler)
    __obj.updateDynamic("chunkAsset")(chunkAsset)
    __obj.updateDynamic("chunkHash")(chunkHash)
    __obj.updateDynamic("failedModule")(failedModule)
    __obj.updateDynamic("finishModules")(finishModules)
    __obj.updateDynamic("finishRebuildingModule")(finishRebuildingModule)
    __obj.updateDynamic("htmlWebpackPluginAfterEmit")(htmlWebpackPluginAfterEmit)
    __obj.updateDynamic("htmlWebpackPluginAfterHtmlProcessing")(htmlWebpackPluginAfterHtmlProcessing)
    __obj.updateDynamic("htmlWebpackPluginAlterAssetTags")(htmlWebpackPluginAlterAssetTags)
    __obj.updateDynamic("htmlWebpackPluginBeforeHtmlGeneration")(htmlWebpackPluginBeforeHtmlGeneration)
    __obj.updateDynamic("htmlWebpackPluginBeforeHtmlProcessing")(htmlWebpackPluginBeforeHtmlProcessing)
    __obj.updateDynamic("moduleAsset")(moduleAsset)
    __obj.updateDynamic("moduleIds")(moduleIds)
    __obj.updateDynamic("needAdditionalPass")(needAdditionalPass)
    __obj.updateDynamic("needAdditionalSeal")(needAdditionalSeal)
    __obj.updateDynamic("normalModuleLoader")(normalModuleLoader)
    __obj.updateDynamic("optimize")(optimize)
    __obj.updateDynamic("optimizeAssets")(optimizeAssets)
    __obj.updateDynamic("optimizeChunkAssets")(optimizeChunkAssets)
    __obj.updateDynamic("optimizeChunkIds")(optimizeChunkIds)
    __obj.updateDynamic("optimizeChunkModules")(optimizeChunkModules)
    __obj.updateDynamic("optimizeChunkModulesAdvanced")(optimizeChunkModulesAdvanced)
    __obj.updateDynamic("optimizeChunkModulesBasic")(optimizeChunkModulesBasic)
    __obj.updateDynamic("optimizeChunkOrder")(optimizeChunkOrder)
    __obj.updateDynamic("optimizeChunks")(optimizeChunks)
    __obj.updateDynamic("optimizeChunksAdvanced")(optimizeChunksAdvanced)
    __obj.updateDynamic("optimizeChunksBasic")(optimizeChunksBasic)
    __obj.updateDynamic("optimizeDependencies")(optimizeDependencies)
    __obj.updateDynamic("optimizeDependenciesAdvanced")(optimizeDependenciesAdvanced)
    __obj.updateDynamic("optimizeDependenciesBasic")(optimizeDependenciesBasic)
    __obj.updateDynamic("optimizeExtractedChunks")(optimizeExtractedChunks)
    __obj.updateDynamic("optimizeExtractedChunksAdvanced")(optimizeExtractedChunksAdvanced)
    __obj.updateDynamic("optimizeExtractedChunksBasic")(optimizeExtractedChunksBasic)
    __obj.updateDynamic("optimizeModuleIds")(optimizeModuleIds)
    __obj.updateDynamic("optimizeModuleOrder")(optimizeModuleOrder)
    __obj.updateDynamic("optimizeModules")(optimizeModules)
    __obj.updateDynamic("optimizeModulesAdvanced")(optimizeModulesAdvanced)
    __obj.updateDynamic("optimizeModulesBasic")(optimizeModulesBasic)
    __obj.updateDynamic("optimizeTree")(optimizeTree)
    __obj.updateDynamic("rebuildModule")(rebuildModule)
    __obj.updateDynamic("record")(record)
    __obj.updateDynamic("recordChunks")(recordChunks)
    __obj.updateDynamic("recordHash")(recordHash)
    __obj.updateDynamic("recordModules")(recordModules)
    __obj.updateDynamic("records")(records)
    __obj.updateDynamic("reviveChunks")(reviveChunks)
    __obj.updateDynamic("reviveModules")(reviveModules)
    __obj.updateDynamic("seal")(seal)
    __obj.updateDynamic("shouldGenerateChunkAssets")(shouldGenerateChunkAssets)
    __obj.updateDynamic("shouldRecord")(shouldRecord)
    __obj.updateDynamic("succeedModule")(succeedModule)
    __obj.updateDynamic("unseal")(unseal)
    __obj.asInstanceOf[Hooks]
  }
}

