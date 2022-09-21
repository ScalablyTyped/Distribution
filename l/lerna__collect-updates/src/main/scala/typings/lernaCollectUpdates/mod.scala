package typings.lernaCollectUpdates

import typings.lernaChildProcess.mod.ExecOpts
import typings.lernaCollectUpdates.collectPackagesMod.PackageCollectorOptions
import typings.lernaPackage.mod.Package
import typings.lernaPackageGraph.mod.PackageGraph
import typings.lernaPackageGraph.packageGraphNodeMod.PackageGraphNode
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@lerna/collect-updates", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def collectPackages(packages: PackageGraphNode, options: PackageCollectorOptions): js.Array[PackageGraphNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("collectPackages")(packages.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[PackageGraphNode]]
  
  inline def collectUpdates(
    filteredPackages: js.Array[Package],
    packageGraph: PackageGraph,
    execOpts: ExecOpts,
    commandOptions: UpdateCollectorOptions
  ): js.Array[PackageGraphNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("collectUpdates")(filteredPackages.asInstanceOf[js.Any], packageGraph.asInstanceOf[js.Any], execOpts.asInstanceOf[js.Any], commandOptions.asInstanceOf[js.Any])).asInstanceOf[js.Array[PackageGraphNode]]
  
  inline def getPackagesForOption(option: String): Set[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPackagesForOption")(option.asInstanceOf[js.Any]).asInstanceOf[Set[String]]
  inline def getPackagesForOption(option: js.Array[String]): Set[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPackagesForOption")(option.asInstanceOf[js.Any]).asInstanceOf[Set[String]]
  inline def getPackagesForOption(option: Boolean): Set[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPackagesForOption")(option.asInstanceOf[js.Any]).asInstanceOf[Set[String]]
  
  trait UpdateCollectorOptions extends StObject {
    
    /**
      * The semver bump keyword (patch/minor/major) or explicit version used
      */
    var bump: js.UndefOr[String] = js.undefined
    
    /**
      * Whether or not to use a "nightly" range (`ref^..ref`) for commits
      */
    var canary: js.UndefOr[Boolean] = js.undefined
    
    var conventionalCommits: js.UndefOr[String] = js.undefined
    
    var conventionalGraduate: js.UndefOr[String] = js.undefined
    
    var excludeDependents: js.UndefOr[String] = js.undefined
    
    /**
      * Which packages, if any, to always include
      *  Force all packages to be versioned with `true`, or pass a list of globs that match package names
      */
    var forcePublish: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A list of globs that match files/directories whose changes
      * should not be considered when identifying changed packages
      */
    var ignoreChanges: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Whether or not to include the --first-parent flag when calling `git describe`
      * (awkwardly, pass `true` to _omit_ the flag, the default is to include it)
      */
    var includeMergedTags: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Ref to use when querying git, defaults to most recent annotated tag
      */
    var since: js.UndefOr[String] = js.undefined
  }
  object UpdateCollectorOptions {
    
    inline def apply(): UpdateCollectorOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateCollectorOptions]
    }
    
    extension [Self <: UpdateCollectorOptions](x: Self) {
      
      inline def setBump(value: String): Self = StObject.set(x, "bump", value.asInstanceOf[js.Any])
      
      inline def setBumpUndefined: Self = StObject.set(x, "bump", js.undefined)
      
      inline def setCanary(value: Boolean): Self = StObject.set(x, "canary", value.asInstanceOf[js.Any])
      
      inline def setCanaryUndefined: Self = StObject.set(x, "canary", js.undefined)
      
      inline def setConventionalCommits(value: String): Self = StObject.set(x, "conventionalCommits", value.asInstanceOf[js.Any])
      
      inline def setConventionalCommitsUndefined: Self = StObject.set(x, "conventionalCommits", js.undefined)
      
      inline def setConventionalGraduate(value: String): Self = StObject.set(x, "conventionalGraduate", value.asInstanceOf[js.Any])
      
      inline def setConventionalGraduateUndefined: Self = StObject.set(x, "conventionalGraduate", js.undefined)
      
      inline def setExcludeDependents(value: String): Self = StObject.set(x, "excludeDependents", value.asInstanceOf[js.Any])
      
      inline def setExcludeDependentsUndefined: Self = StObject.set(x, "excludeDependents", js.undefined)
      
      inline def setForcePublish(value: Boolean): Self = StObject.set(x, "forcePublish", value.asInstanceOf[js.Any])
      
      inline def setForcePublishUndefined: Self = StObject.set(x, "forcePublish", js.undefined)
      
      inline def setIgnoreChanges(value: js.Array[String]): Self = StObject.set(x, "ignoreChanges", value.asInstanceOf[js.Any])
      
      inline def setIgnoreChangesUndefined: Self = StObject.set(x, "ignoreChanges", js.undefined)
      
      inline def setIgnoreChangesVarargs(value: String*): Self = StObject.set(x, "ignoreChanges", js.Array(value*))
      
      inline def setIncludeMergedTags(value: Boolean): Self = StObject.set(x, "includeMergedTags", value.asInstanceOf[js.Any])
      
      inline def setIncludeMergedTagsUndefined: Self = StObject.set(x, "includeMergedTags", js.undefined)
      
      inline def setSince(value: String): Self = StObject.set(x, "since", value.asInstanceOf[js.Any])
      
      inline def setSinceUndefined: Self = StObject.set(x, "since", js.undefined)
    }
  }
}
