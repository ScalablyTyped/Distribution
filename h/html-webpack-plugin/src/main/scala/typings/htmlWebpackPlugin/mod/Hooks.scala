package typings.htmlWebpackPlugin.mod

import typings.htmlWebpackPlugin.AnonAssets
import typings.htmlWebpackPlugin.AnonAssetsHtml
import typings.htmlWebpackPlugin.AnonBody
import typings.htmlWebpackPlugin.AnonHtml
import typings.std.Error
import typings.tapable.mod.AsyncSeriesHook
import typings.tapable.mod.AsyncSeriesWaterfallHook
import typings.tapable.mod.SyncBailHook
import typings.tapable.mod.SyncHook
import typings.tapable.mod.SyncWaterfallHook
import typings.webpack.mod.compilation.Asset
import typings.webpack.mod.compilation.Chunk
import typings.webpack.mod.compilation.ChunkGroup
import typings.webpack.mod.compilation.ChunkHash
import typings.webpack.mod.compilation.Compilation
import typings.webpack.mod.compilation.CompilationHooks
import typings.webpack.mod.compilation.Module
import typings.webpack.mod.compilation.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Hooks extends CompilationHooks {
  var htmlWebpackPluginAfterEmit: AsyncSeriesWaterfallHook[AnonHtml, _, _]
  var htmlWebpackPluginAfterHtmlProcessing: AsyncSeriesWaterfallHook[AnonAssetsHtml, _, _]
  var htmlWebpackPluginAlterAssetTags: AsyncSeriesWaterfallHook[AnonBody, _, _]
  var htmlWebpackPluginBeforeHtmlGeneration: AsyncSeriesWaterfallHook[AnonAssets, _, _]
  var htmlWebpackPluginBeforeHtmlProcessing: AsyncSeriesWaterfallHook[AnonAssetsHtml, _, _]
}

object Hooks {
  @scala.inline
  def apply(
    additionalAssets: AsyncSeriesHook[_, _, _],
    additionalChunkAssets: SyncHook[js.Array[Chunk], _, _],
    advancedOptimizeModuleOrder: SyncHook[js.Array[Module], _, _],
    afterHash: SyncHook[_, _, _],
    afterOptimizeAssets: SyncHook[js.Array[Asset], _, _],
    afterOptimizeChunkAssets: SyncHook[js.Array[Chunk], _, _],
    afterOptimizeChunkIds: SyncHook[js.Array[Chunk], _, _],
    afterOptimizeChunkModules: SyncHook[js.Array[Chunk], js.Array[Module], _],
    afterOptimizeChunks: SyncHook[js.Array[Chunk], js.Array[ChunkGroup], _],
    afterOptimizeDependencies: SyncHook[js.Array[Module], _, _],
    afterOptimizeExtractedChunks: SyncHook[js.Array[Chunk], _, _],
    afterOptimizeModuleIds: SyncHook[js.Array[Module], _, _],
    afterOptimizeModules: SyncHook[js.Array[Module], _, _],
    afterOptimizeTree: SyncHook[js.Array[Chunk], js.Array[Module], _],
    afterSeal: AsyncSeriesHook[_, _, _],
    assetPath: SyncWaterfallHook[String, _, _],
    beforeChunkAssets: SyncHook[_, _, _],
    beforeChunkIds: SyncHook[js.Array[Chunk], _, _],
    beforeHash: SyncHook[_, _, _],
    beforeModuleAssets: SyncHook[_, _, _],
    beforeModuleIds: SyncHook[js.Array[Module], _, _],
    buildModule: SyncHook[Module, _, _],
    childCompiler: SyncHook[_, _, _],
    chunkAsset: SyncHook[Chunk, String, _],
    chunkHash: SyncHook[Chunk, ChunkHash, _],
    failedModule: SyncHook[Module, Error, _],
    finishModules: SyncHook[js.Array[Module], _, _],
    finishRebuildingModule: SyncHook[Module, _, _],
    htmlWebpackPluginAfterEmit: AsyncSeriesWaterfallHook[AnonHtml, _, _],
    htmlWebpackPluginAfterHtmlProcessing: AsyncSeriesWaterfallHook[AnonAssetsHtml, _, _],
    htmlWebpackPluginAlterAssetTags: AsyncSeriesWaterfallHook[AnonBody, _, _],
    htmlWebpackPluginBeforeHtmlGeneration: AsyncSeriesWaterfallHook[AnonAssets, _, _],
    htmlWebpackPluginBeforeHtmlProcessing: AsyncSeriesWaterfallHook[AnonAssetsHtml, _, _],
    moduleAsset: SyncHook[Module, String, _],
    moduleIds: SyncHook[js.Array[Module], _, _],
    needAdditionalPass: SyncBailHook[_, _, _, _],
    needAdditionalSeal: SyncBailHook[_, _, _, _],
    normalModuleLoader: SyncHook[_, Module, _],
    optimize: SyncHook[_, _, _],
    optimizeAssets: AsyncSeriesHook[js.Array[Asset], _, _],
    optimizeChunkAssets: AsyncSeriesHook[js.Array[Chunk], _, _],
    optimizeChunkIds: SyncHook[js.Array[Chunk], _, _],
    optimizeChunkModules: SyncBailHook[js.Array[Chunk], js.Array[Module], _, _],
    optimizeChunkModulesAdvanced: SyncBailHook[js.Array[Chunk], js.Array[Module], _, _],
    optimizeChunkModulesBasic: SyncBailHook[js.Array[Chunk], js.Array[Module], _, _],
    optimizeChunkOrder: SyncHook[js.Array[Chunk], _, _],
    optimizeChunks: SyncBailHook[js.Array[Chunk], js.Array[ChunkGroup], _, _],
    optimizeChunksAdvanced: SyncBailHook[js.Array[Chunk], js.Array[ChunkGroup], _, _],
    optimizeChunksBasic: SyncBailHook[js.Array[Chunk], js.Array[ChunkGroup], _, _],
    optimizeDependencies: SyncBailHook[js.Array[Module], _, _, _],
    optimizeDependenciesAdvanced: SyncBailHook[js.Array[Module], _, _, _],
    optimizeDependenciesBasic: SyncBailHook[js.Array[Module], _, _, _],
    optimizeExtractedChunks: SyncBailHook[js.Array[Chunk], _, _, _],
    optimizeExtractedChunksAdvanced: SyncBailHook[js.Array[Chunk], _, _, _],
    optimizeExtractedChunksBasic: SyncBailHook[js.Array[Chunk], _, _, _],
    optimizeModuleIds: SyncHook[js.Array[Module], _, _],
    optimizeModuleOrder: SyncHook[js.Array[Module], _, _],
    optimizeModules: SyncBailHook[js.Array[Module], _, _, _],
    optimizeModulesAdvanced: SyncBailHook[js.Array[Module], _, _, _],
    optimizeModulesBasic: SyncBailHook[js.Array[Module], _, _, _],
    optimizeTree: AsyncSeriesHook[js.Array[Chunk], js.Array[Module], _],
    rebuildModule: SyncHook[Module, _, _],
    record: SyncHook[Compilation, js.Array[Record], _],
    recordChunks: SyncHook[js.Array[Chunk], js.Array[Record], _],
    recordHash: SyncHook[js.Array[Record], _, _],
    recordModules: SyncHook[js.Array[Module], js.Array[Record], _],
    records: SyncHook[Compilation, js.Array[Record], _],
    reviveChunks: SyncHook[js.Array[Chunk], js.Array[Record], _],
    reviveModules: SyncHook[js.Array[Module], js.Array[Record], _],
    seal: SyncHook[_, _, _],
    shouldGenerateChunkAssets: SyncBailHook[_, _, _, _],
    shouldRecord: SyncBailHook[_, _, _, _],
    succeedModule: SyncHook[Module, _, _],
    unseal: SyncHook[_, _, _]
  ): Hooks = {
    val __obj = js.Dynamic.literal(additionalAssets = additionalAssets.asInstanceOf[js.Any], additionalChunkAssets = additionalChunkAssets.asInstanceOf[js.Any], advancedOptimizeModuleOrder = advancedOptimizeModuleOrder.asInstanceOf[js.Any], afterHash = afterHash.asInstanceOf[js.Any], afterOptimizeAssets = afterOptimizeAssets.asInstanceOf[js.Any], afterOptimizeChunkAssets = afterOptimizeChunkAssets.asInstanceOf[js.Any], afterOptimizeChunkIds = afterOptimizeChunkIds.asInstanceOf[js.Any], afterOptimizeChunkModules = afterOptimizeChunkModules.asInstanceOf[js.Any], afterOptimizeChunks = afterOptimizeChunks.asInstanceOf[js.Any], afterOptimizeDependencies = afterOptimizeDependencies.asInstanceOf[js.Any], afterOptimizeExtractedChunks = afterOptimizeExtractedChunks.asInstanceOf[js.Any], afterOptimizeModuleIds = afterOptimizeModuleIds.asInstanceOf[js.Any], afterOptimizeModules = afterOptimizeModules.asInstanceOf[js.Any], afterOptimizeTree = afterOptimizeTree.asInstanceOf[js.Any], afterSeal = afterSeal.asInstanceOf[js.Any], assetPath = assetPath.asInstanceOf[js.Any], beforeChunkAssets = beforeChunkAssets.asInstanceOf[js.Any], beforeChunkIds = beforeChunkIds.asInstanceOf[js.Any], beforeHash = beforeHash.asInstanceOf[js.Any], beforeModuleAssets = beforeModuleAssets.asInstanceOf[js.Any], beforeModuleIds = beforeModuleIds.asInstanceOf[js.Any], buildModule = buildModule.asInstanceOf[js.Any], childCompiler = childCompiler.asInstanceOf[js.Any], chunkAsset = chunkAsset.asInstanceOf[js.Any], chunkHash = chunkHash.asInstanceOf[js.Any], failedModule = failedModule.asInstanceOf[js.Any], finishModules = finishModules.asInstanceOf[js.Any], finishRebuildingModule = finishRebuildingModule.asInstanceOf[js.Any], htmlWebpackPluginAfterEmit = htmlWebpackPluginAfterEmit.asInstanceOf[js.Any], htmlWebpackPluginAfterHtmlProcessing = htmlWebpackPluginAfterHtmlProcessing.asInstanceOf[js.Any], htmlWebpackPluginAlterAssetTags = htmlWebpackPluginAlterAssetTags.asInstanceOf[js.Any], htmlWebpackPluginBeforeHtmlGeneration = htmlWebpackPluginBeforeHtmlGeneration.asInstanceOf[js.Any], htmlWebpackPluginBeforeHtmlProcessing = htmlWebpackPluginBeforeHtmlProcessing.asInstanceOf[js.Any], moduleAsset = moduleAsset.asInstanceOf[js.Any], moduleIds = moduleIds.asInstanceOf[js.Any], needAdditionalPass = needAdditionalPass.asInstanceOf[js.Any], needAdditionalSeal = needAdditionalSeal.asInstanceOf[js.Any], normalModuleLoader = normalModuleLoader.asInstanceOf[js.Any], optimize = optimize.asInstanceOf[js.Any], optimizeAssets = optimizeAssets.asInstanceOf[js.Any], optimizeChunkAssets = optimizeChunkAssets.asInstanceOf[js.Any], optimizeChunkIds = optimizeChunkIds.asInstanceOf[js.Any], optimizeChunkModules = optimizeChunkModules.asInstanceOf[js.Any], optimizeChunkModulesAdvanced = optimizeChunkModulesAdvanced.asInstanceOf[js.Any], optimizeChunkModulesBasic = optimizeChunkModulesBasic.asInstanceOf[js.Any], optimizeChunkOrder = optimizeChunkOrder.asInstanceOf[js.Any], optimizeChunks = optimizeChunks.asInstanceOf[js.Any], optimizeChunksAdvanced = optimizeChunksAdvanced.asInstanceOf[js.Any], optimizeChunksBasic = optimizeChunksBasic.asInstanceOf[js.Any], optimizeDependencies = optimizeDependencies.asInstanceOf[js.Any], optimizeDependenciesAdvanced = optimizeDependenciesAdvanced.asInstanceOf[js.Any], optimizeDependenciesBasic = optimizeDependenciesBasic.asInstanceOf[js.Any], optimizeExtractedChunks = optimizeExtractedChunks.asInstanceOf[js.Any], optimizeExtractedChunksAdvanced = optimizeExtractedChunksAdvanced.asInstanceOf[js.Any], optimizeExtractedChunksBasic = optimizeExtractedChunksBasic.asInstanceOf[js.Any], optimizeModuleIds = optimizeModuleIds.asInstanceOf[js.Any], optimizeModuleOrder = optimizeModuleOrder.asInstanceOf[js.Any], optimizeModules = optimizeModules.asInstanceOf[js.Any], optimizeModulesAdvanced = optimizeModulesAdvanced.asInstanceOf[js.Any], optimizeModulesBasic = optimizeModulesBasic.asInstanceOf[js.Any], optimizeTree = optimizeTree.asInstanceOf[js.Any], rebuildModule = rebuildModule.asInstanceOf[js.Any], record = record.asInstanceOf[js.Any], recordChunks = recordChunks.asInstanceOf[js.Any], recordHash = recordHash.asInstanceOf[js.Any], recordModules = recordModules.asInstanceOf[js.Any], records = records.asInstanceOf[js.Any], reviveChunks = reviveChunks.asInstanceOf[js.Any], reviveModules = reviveModules.asInstanceOf[js.Any], seal = seal.asInstanceOf[js.Any], shouldGenerateChunkAssets = shouldGenerateChunkAssets.asInstanceOf[js.Any], shouldRecord = shouldRecord.asInstanceOf[js.Any], succeedModule = succeedModule.asInstanceOf[js.Any], unseal = unseal.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Hooks]
  }
}

