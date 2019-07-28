package typings.htmlDashWebpackDashPlugin.htmlDashWebpackDashPluginMod

import typings.htmlDashWebpackDashPlugin.Anon_Assets
import typings.htmlDashWebpackDashPlugin.Anon_AssetsHtml
import typings.htmlDashWebpackDashPlugin.Anon_Body
import typings.htmlDashWebpackDashPlugin.Anon_Html
import typings.std.Error
import typings.tapable.tapableMod.AsyncSeriesHook
import typings.tapable.tapableMod.AsyncSeriesWaterfallHook
import typings.tapable.tapableMod.SyncBailHook
import typings.tapable.tapableMod.SyncHook
import typings.tapable.tapableMod.SyncWaterfallHook
import typings.webpack.webpackMod.compilationNs.Asset
import typings.webpack.webpackMod.compilationNs.Chunk
import typings.webpack.webpackMod.compilationNs.ChunkGroup
import typings.webpack.webpackMod.compilationNs.ChunkHash
import typings.webpack.webpackMod.compilationNs.Compilation
import typings.webpack.webpackMod.compilationNs.CompilationHooks
import typings.webpack.webpackMod.compilationNs.Module
import typings.webpack.webpackMod.compilationNs.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Hooks extends CompilationHooks {
  var htmlWebpackPluginAfterEmit: AsyncSeriesWaterfallHook[Anon_Html, _, _]
  var htmlWebpackPluginAfterHtmlProcessing: AsyncSeriesWaterfallHook[Anon_AssetsHtml, _, _]
  var htmlWebpackPluginAlterAssetTags: AsyncSeriesWaterfallHook[Anon_Body, _, _]
  var htmlWebpackPluginBeforeHtmlGeneration: AsyncSeriesWaterfallHook[Anon_Assets, _, _]
  var htmlWebpackPluginBeforeHtmlProcessing: AsyncSeriesWaterfallHook[Anon_AssetsHtml, _, _]
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
    htmlWebpackPluginAfterEmit: AsyncSeriesWaterfallHook[Anon_Html, _, _],
    htmlWebpackPluginAfterHtmlProcessing: AsyncSeriesWaterfallHook[Anon_AssetsHtml, _, _],
    htmlWebpackPluginAlterAssetTags: AsyncSeriesWaterfallHook[Anon_Body, _, _],
    htmlWebpackPluginBeforeHtmlGeneration: AsyncSeriesWaterfallHook[Anon_Assets, _, _],
    htmlWebpackPluginBeforeHtmlProcessing: AsyncSeriesWaterfallHook[Anon_AssetsHtml, _, _],
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
    val __obj = js.Dynamic.literal(additionalAssets = additionalAssets, additionalChunkAssets = additionalChunkAssets, advancedOptimizeModuleOrder = advancedOptimizeModuleOrder, afterHash = afterHash, afterOptimizeAssets = afterOptimizeAssets, afterOptimizeChunkAssets = afterOptimizeChunkAssets, afterOptimizeChunkIds = afterOptimizeChunkIds, afterOptimizeChunkModules = afterOptimizeChunkModules, afterOptimizeChunks = afterOptimizeChunks, afterOptimizeDependencies = afterOptimizeDependencies, afterOptimizeExtractedChunks = afterOptimizeExtractedChunks, afterOptimizeModuleIds = afterOptimizeModuleIds, afterOptimizeModules = afterOptimizeModules, afterOptimizeTree = afterOptimizeTree, afterSeal = afterSeal, assetPath = assetPath, beforeChunkAssets = beforeChunkAssets, beforeChunkIds = beforeChunkIds, beforeHash = beforeHash, beforeModuleAssets = beforeModuleAssets, beforeModuleIds = beforeModuleIds, buildModule = buildModule, childCompiler = childCompiler, chunkAsset = chunkAsset, chunkHash = chunkHash, failedModule = failedModule, finishModules = finishModules, finishRebuildingModule = finishRebuildingModule, htmlWebpackPluginAfterEmit = htmlWebpackPluginAfterEmit, htmlWebpackPluginAfterHtmlProcessing = htmlWebpackPluginAfterHtmlProcessing, htmlWebpackPluginAlterAssetTags = htmlWebpackPluginAlterAssetTags, htmlWebpackPluginBeforeHtmlGeneration = htmlWebpackPluginBeforeHtmlGeneration, htmlWebpackPluginBeforeHtmlProcessing = htmlWebpackPluginBeforeHtmlProcessing, moduleAsset = moduleAsset, moduleIds = moduleIds, needAdditionalPass = needAdditionalPass, needAdditionalSeal = needAdditionalSeal, normalModuleLoader = normalModuleLoader, optimize = optimize, optimizeAssets = optimizeAssets, optimizeChunkAssets = optimizeChunkAssets, optimizeChunkIds = optimizeChunkIds, optimizeChunkModules = optimizeChunkModules, optimizeChunkModulesAdvanced = optimizeChunkModulesAdvanced, optimizeChunkModulesBasic = optimizeChunkModulesBasic, optimizeChunkOrder = optimizeChunkOrder, optimizeChunks = optimizeChunks, optimizeChunksAdvanced = optimizeChunksAdvanced, optimizeChunksBasic = optimizeChunksBasic, optimizeDependencies = optimizeDependencies, optimizeDependenciesAdvanced = optimizeDependenciesAdvanced, optimizeDependenciesBasic = optimizeDependenciesBasic, optimizeExtractedChunks = optimizeExtractedChunks, optimizeExtractedChunksAdvanced = optimizeExtractedChunksAdvanced, optimizeExtractedChunksBasic = optimizeExtractedChunksBasic, optimizeModuleIds = optimizeModuleIds, optimizeModuleOrder = optimizeModuleOrder, optimizeModules = optimizeModules, optimizeModulesAdvanced = optimizeModulesAdvanced, optimizeModulesBasic = optimizeModulesBasic, optimizeTree = optimizeTree, rebuildModule = rebuildModule, record = record, recordChunks = recordChunks, recordHash = recordHash, recordModules = recordModules, records = records, reviveChunks = reviveChunks, reviveModules = reviveModules, seal = seal, shouldGenerateChunkAssets = shouldGenerateChunkAssets, shouldRecord = shouldRecord, succeedModule = succeedModule, unseal = unseal)
  
    __obj.asInstanceOf[Hooks]
  }
}

