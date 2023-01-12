package typings.ipfsCoreTypes.distSrcRootMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddAllOptions
  extends StObject
     with AddOptions {
  
  /**
    * Allows to create directories with an unlimited number of entries currently
    * size of unixfs directories is limited by the maximum block size.
    * ** Note ** that this is an experimental feature. (Defaults to `false`)
    */
  var enableShardingExperiment: js.UndefOr[Boolean] = js.undefined
  
  /**
    * How many files to write concurrently
    */
  var fileImportConcurrency: js.UndefOr[Double] = js.undefined
  
  /**
    * Directories with more than this number of files will be created as HAMT -
    * sharded directories. (Defaults to 1000)
    */
  var shardSplitThreshold: js.UndefOr[Double] = js.undefined
}
object AddAllOptions {
  
  inline def apply(): AddAllOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddAllOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AddAllOptions] (val x: Self) extends AnyVal {
    
    inline def setEnableShardingExperiment(value: Boolean): Self = StObject.set(x, "enableShardingExperiment", value.asInstanceOf[js.Any])
    
    inline def setEnableShardingExperimentUndefined: Self = StObject.set(x, "enableShardingExperiment", js.undefined)
    
    inline def setFileImportConcurrency(value: Double): Self = StObject.set(x, "fileImportConcurrency", value.asInstanceOf[js.Any])
    
    inline def setFileImportConcurrencyUndefined: Self = StObject.set(x, "fileImportConcurrency", js.undefined)
    
    inline def setShardSplitThreshold(value: Double): Self = StObject.set(x, "shardSplitThreshold", value.asInstanceOf[js.Any])
    
    inline def setShardSplitThresholdUndefined: Self = StObject.set(x, "shardSplitThreshold", js.undefined)
  }
}
