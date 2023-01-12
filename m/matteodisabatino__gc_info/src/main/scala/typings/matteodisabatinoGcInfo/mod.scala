package typings.matteodisabatinoGcInfo

import typings.matteodisabatinoGcInfo.matteodisabatinoGcInfoStrings.data
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@matteodisabatino/gc_info", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait GcType extends StObject
  @JSImport("@matteodisabatino/gc_info", "GcType")
  @js.native
  object GcType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[GcType & Double] = js.native
    
    @js.native
    sealed trait All
      extends StObject
         with GcType
    /* 15 */ val All: typings.matteodisabatinoGcInfo.mod.GcType.All & Double = js.native
    
    @js.native
    sealed trait IncrementalMarking
      extends StObject
         with GcType
    /* 4 */ val IncrementalMarking: typings.matteodisabatinoGcInfo.mod.GcType.IncrementalMarking & Double = js.native
    
    @js.native
    sealed trait MarkSlashSweepSlashCompact
      extends StObject
         with GcType
    /* 2 */ val MarkSlashSweepSlashCompact: typings.matteodisabatinoGcInfo.mod.GcType.MarkSlashSweepSlashCompact & Double = js.native
    
    @js.native
    sealed trait Scavenge
      extends StObject
         with GcType
    /* 1 */ val Scavenge: typings.matteodisabatinoGcInfo.mod.GcType.Scavenge & Double = js.native
    
    @js.native
    sealed trait WeakSlashPhantomCallbackProcessing
      extends StObject
         with GcType
    /* 8 */ val WeakSlashPhantomCallbackProcessing: typings.matteodisabatinoGcInfo.mod.GcType.WeakSlashPhantomCallbackProcessing & Double = js.native
  }
  
  inline def off_data(event: data): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("off")(event.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def off_data(event: data, callback: js.Function1[/* stats */ GcInfo, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("off")(event.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def on_data(event: data, callback: js.Function1[/* stats */ GcInfo, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(event.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("@matteodisabatino/gc_info", "path")
  @js.native
  val path: String = js.native
  
  @JSImport("@matteodisabatino/gc_info", "version")
  @js.native
  val version: String = js.native
  
  trait GcInfo extends StObject {
    
    /**
      * Effective stats (difference between post and pre).
      */
    var diff: GcStats
    
    /**
      * The time the GC has been active (difference between endedAt and
      * startedAt).
      */
    var duration: Double
    
    /**
      * The moment the GC ended (Unix timestamp in milliseconds).
      */
    var endedAt: Double
    
    /**
      * Memory allocation type.
      */
    var gctype: Double
    
    /**
      * Stats at the moment the GC ended
      */
    var post: GcStats
    
    /**
      * Stats at the moment the GC started
      */
    var pre: GcStats
    
    /**
      * The moment the GC started (Unix timestamp in milliseconds).
      */
    var startedAt: Double
  }
  object GcInfo {
    
    inline def apply(
      diff: GcStats,
      duration: Double,
      endedAt: Double,
      gctype: Double,
      post: GcStats,
      pre: GcStats,
      startedAt: Double
    ): GcInfo = {
      val __obj = js.Dynamic.literal(diff = diff.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], endedAt = endedAt.asInstanceOf[js.Any], gctype = gctype.asInstanceOf[js.Any], post = post.asInstanceOf[js.Any], pre = pre.asInstanceOf[js.Any], startedAt = startedAt.asInstanceOf[js.Any])
      __obj.asInstanceOf[GcInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GcInfo] (val x: Self) extends AnyVal {
      
      inline def setDiff(value: GcStats): Self = StObject.set(x, "diff", value.asInstanceOf[js.Any])
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setEndedAt(value: Double): Self = StObject.set(x, "endedAt", value.asInstanceOf[js.Any])
      
      inline def setGctype(value: Double): Self = StObject.set(x, "gctype", value.asInstanceOf[js.Any])
      
      inline def setPost(value: GcStats): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
      
      inline def setPre(value: GcStats): Self = StObject.set(x, "pre", value.asInstanceOf[js.Any])
      
      inline def setStartedAt(value: Double): Self = StObject.set(x, "startedAt", value.asInstanceOf[js.Any])
    }
  }
  
  trait GcStats extends StObject {
    
    /**
      * Number of bytes of memory allocated outside of v8's heap. (Node.js 12+)
      */
    var externalMemory: js.UndefOr[Double] = js.undefined
    
    /**
      * The absolute limit the heap cannot exceed.
      */
    var heapSizeLimit: Double
    
    /**
      * Current amount of memory, obtained via malloc. (Node.js 7+)
      */
    var mallocedMemory: js.UndefOr[Double] = js.undefined
    
    /**
      * Number of contexts that were detached and not yet garbage collected. (Node.js 10+)
      */
    var numberOfDetachedContexts: js.UndefOr[Double] = js.undefined
    
    /**
      * Number of the top-level contexts currently active. (Node.js 10+)
      */
    var numberOfNativeContexts: js.UndefOr[Double] = js.undefined
    
    /**
      * Peak amount of memory, obtained via malloc. (Node.js 7+)
      */
    var peakMallocedMemory: js.UndefOr[Double] = js.undefined
    
    /**
      * Available heap size. (Node.js 4+)
      */
    var totalAvailableSize: js.UndefOr[Double] = js.undefined
    
    /**
      * Size of all global handles in the heap. (Node.js 14+)
      */
    var totalGlobalHandlesSize: js.UndefOr[Double] = js.undefined
    
    /**
      * Number of bytes V8 has allocated for the heap.
      */
    var totalHeapSize: Double
    
    /**
      * Number of bytes for compiled bytecode and JITed code.
      */
    var totalHeapSizeExecutable: Double
    
    /**
      * Committed size. (Node.js 0.12+)
      */
    var totalPhysicalSize: js.UndefOr[Double] = js.undefined
    
    /**
      * Size of all allocated/used global handles in the heap. (Node.js 14+)
      */
    var usedGlobalHandlesSize: js.UndefOr[Double] = js.undefined
    
    /**
      * Number of bytes in use by application data.
      */
    var usedHeapSize: Double
  }
  object GcStats {
    
    inline def apply(
      heapSizeLimit: Double,
      totalHeapSize: Double,
      totalHeapSizeExecutable: Double,
      usedHeapSize: Double
    ): GcStats = {
      val __obj = js.Dynamic.literal(heapSizeLimit = heapSizeLimit.asInstanceOf[js.Any], totalHeapSize = totalHeapSize.asInstanceOf[js.Any], totalHeapSizeExecutable = totalHeapSizeExecutable.asInstanceOf[js.Any], usedHeapSize = usedHeapSize.asInstanceOf[js.Any])
      __obj.asInstanceOf[GcStats]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GcStats] (val x: Self) extends AnyVal {
      
      inline def setExternalMemory(value: Double): Self = StObject.set(x, "externalMemory", value.asInstanceOf[js.Any])
      
      inline def setExternalMemoryUndefined: Self = StObject.set(x, "externalMemory", js.undefined)
      
      inline def setHeapSizeLimit(value: Double): Self = StObject.set(x, "heapSizeLimit", value.asInstanceOf[js.Any])
      
      inline def setMallocedMemory(value: Double): Self = StObject.set(x, "mallocedMemory", value.asInstanceOf[js.Any])
      
      inline def setMallocedMemoryUndefined: Self = StObject.set(x, "mallocedMemory", js.undefined)
      
      inline def setNumberOfDetachedContexts(value: Double): Self = StObject.set(x, "numberOfDetachedContexts", value.asInstanceOf[js.Any])
      
      inline def setNumberOfDetachedContextsUndefined: Self = StObject.set(x, "numberOfDetachedContexts", js.undefined)
      
      inline def setNumberOfNativeContexts(value: Double): Self = StObject.set(x, "numberOfNativeContexts", value.asInstanceOf[js.Any])
      
      inline def setNumberOfNativeContextsUndefined: Self = StObject.set(x, "numberOfNativeContexts", js.undefined)
      
      inline def setPeakMallocedMemory(value: Double): Self = StObject.set(x, "peakMallocedMemory", value.asInstanceOf[js.Any])
      
      inline def setPeakMallocedMemoryUndefined: Self = StObject.set(x, "peakMallocedMemory", js.undefined)
      
      inline def setTotalAvailableSize(value: Double): Self = StObject.set(x, "totalAvailableSize", value.asInstanceOf[js.Any])
      
      inline def setTotalAvailableSizeUndefined: Self = StObject.set(x, "totalAvailableSize", js.undefined)
      
      inline def setTotalGlobalHandlesSize(value: Double): Self = StObject.set(x, "totalGlobalHandlesSize", value.asInstanceOf[js.Any])
      
      inline def setTotalGlobalHandlesSizeUndefined: Self = StObject.set(x, "totalGlobalHandlesSize", js.undefined)
      
      inline def setTotalHeapSize(value: Double): Self = StObject.set(x, "totalHeapSize", value.asInstanceOf[js.Any])
      
      inline def setTotalHeapSizeExecutable(value: Double): Self = StObject.set(x, "totalHeapSizeExecutable", value.asInstanceOf[js.Any])
      
      inline def setTotalPhysicalSize(value: Double): Self = StObject.set(x, "totalPhysicalSize", value.asInstanceOf[js.Any])
      
      inline def setTotalPhysicalSizeUndefined: Self = StObject.set(x, "totalPhysicalSize", js.undefined)
      
      inline def setUsedGlobalHandlesSize(value: Double): Self = StObject.set(x, "usedGlobalHandlesSize", value.asInstanceOf[js.Any])
      
      inline def setUsedGlobalHandlesSizeUndefined: Self = StObject.set(x, "usedGlobalHandlesSize", js.undefined)
      
      inline def setUsedHeapSize(value: Double): Self = StObject.set(x, "usedHeapSize", value.asInstanceOf[js.Any])
    }
  }
}
