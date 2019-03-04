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
    val __obj = js.Dynamic.literal(additionalAssets = additionalAssets, additionalChunkAssets = additionalChunkAssets, advancedOptimizeModuleOrder = advancedOptimizeModuleOrder, afterHash = afterHash, afterOptimizeAssets = afterOptimizeAssets, afterOptimizeChunkAssets = afterOptimizeChunkAssets, afterOptimizeChunkIds = afterOptimizeChunkIds, afterOptimizeChunkModules = afterOptimizeChunkModules, afterOptimizeChunks = afterOptimizeChunks, afterOptimizeDependencies = afterOptimizeDependencies, afterOptimizeExtractedChunks = afterOptimizeExtractedChunks, afterOptimizeModuleIds = afterOptimizeModuleIds, afterOptimizeModules = afterOptimizeModules, afterOptimizeTree = afterOptimizeTree, afterSeal = afterSeal, assetPath = assetPath, beforeChunkAssets = beforeChunkAssets, beforeChunkIds = beforeChunkIds, beforeHash = beforeHash, beforeModuleAssets = beforeModuleAssets, beforeModuleIds = beforeModuleIds, buildModule = buildModule, childCompiler = childCompiler, chunkAsset = chunkAsset, chunkHash = chunkHash, failedModule = failedModule, finishModules = finishModules, finishRebuildingModule = finishRebuildingModule, htmlWebpackPluginAfterEmit = htmlWebpackPluginAfterEmit, htmlWebpackPluginAfterHtmlProcessing = htmlWebpackPluginAfterHtmlProcessing, htmlWebpackPluginAlterAssetTags = htmlWebpackPluginAlterAssetTags, htmlWebpackPluginBeforeHtmlGeneration = htmlWebpackPluginBeforeHtmlGeneration, htmlWebpackPluginBeforeHtmlProcessing = htmlWebpackPluginBeforeHtmlProcessing, moduleAsset = moduleAsset, moduleIds = moduleIds, needAdditionalPass = needAdditionalPass, needAdditionalSeal = needAdditionalSeal, normalModuleLoader = normalModuleLoader, optimize = optimize, optimizeAssets = optimizeAssets, optimizeChunkAssets = optimizeChunkAssets, optimizeChunkIds = optimizeChunkIds, optimizeChunkModules = optimizeChunkModules, optimizeChunkModulesAdvanced = optimizeChunkModulesAdvanced, optimizeChunkModulesBasic = optimizeChunkModulesBasic, optimizeChunkOrder = optimizeChunkOrder, optimizeChunks = optimizeChunks, optimizeChunksAdvanced = optimizeChunksAdvanced, optimizeChunksBasic = optimizeChunksBasic, optimizeDependencies = optimizeDependencies, optimizeDependenciesAdvanced = optimizeDependenciesAdvanced, optimizeDependenciesBasic = optimizeDependenciesBasic, optimizeExtractedChunks = optimizeExtractedChunks, optimizeExtractedChunksAdvanced = optimizeExtractedChunksAdvanced, optimizeExtractedChunksBasic = optimizeExtractedChunksBasic, optimizeModuleIds = optimizeModuleIds, optimizeModuleOrder = optimizeModuleOrder, optimizeModules = optimizeModules, optimizeModulesAdvanced = optimizeModulesAdvanced, optimizeModulesBasic = optimizeModulesBasic, optimizeTree = optimizeTree, rebuildModule = rebuildModule, record = record, recordChunks = recordChunks, recordHash = recordHash, recordModules = recordModules, records = records, reviveChunks = reviveChunks, reviveModules = reviveModules, seal = seal, shouldGenerateChunkAssets = shouldGenerateChunkAssets, shouldRecord = shouldRecord, succeedModule = succeedModule, unseal = unseal)
  
    __obj.asInstanceOf[Hooks]
  }
}

