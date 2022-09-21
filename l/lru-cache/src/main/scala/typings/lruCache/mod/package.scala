package typings.lruCache.mod

import typings.lruCache.anon.MaxEntrySize
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type Disposer[K, V] = js.Function3[/* value */ V, /* key */ K, /* reason */ DisposeReason, Unit]

type Fetcher[K, V] = js.Function3[
/* key */ K, 
/* staleValue */ V, 
/* options */ FetcherOptions[K, V], 
js.UndefOr[(js.Promise[js.UndefOr[V | Unit]]) | V | Unit]]

type LRUMilliseconds = Double

type MaybeMaxEntrySizeLimit[K, V] = (MaxEntrySize[K, V]) | js.Object

type Options[K, V] = (SharedOptions[K, V]) & (DeprecatedOptions[K, V]) & (SafetyBounds[K, V]) & (MaybeMaxEntrySizeLimit[K, V])

type SizeCalculator[K, V] = js.Function2[/* value */ V, /* key */ K, Double]
