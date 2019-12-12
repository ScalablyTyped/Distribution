package typings.heremaps.H.clustering.Provider

import org.scalablytyped.runtime.TopLevel
import typings.heremaps.H.clustering.Provider.Strategy.DYNAMICGRID
import typings.heremaps.H.clustering.Provider.Strategy.FASTGRID
import typings.heremaps.H.clustering.Provider.Strategy.GRID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Strategy extends js.Object

/**
  * Enumeration represents possible clustering strategies. FASTGRID clustering is the efficient way to cluster large sets of data points.
  * GRID clustering is slower but has greater precision due to the bigger range of epsilon values, this strategy suitable for clustering smaller data sets (up to 1000 data points)
  * on desktop devices. DYNAMICGRID clustering uses the same algorithm of clustering as the GRID, but clusters on the viewport basis is meant to be used with data sets that are subject
  * to the frequent update operations.
  */
@JSGlobal("H.clustering.Provider.Strategy")
@js.native
object Strategy extends js.Object {
  @js.native
  sealed trait DYNAMICGRID extends Strategy
  
  @js.native
  sealed trait FASTGRID extends Strategy
  
  @js.native
  sealed trait GRID extends Strategy
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Strategy with Double] = js.native
  /* 2 */ @js.native
  object DYNAMICGRID extends TopLevel[DYNAMICGRID with Double]
  
  /* 0 */ @js.native
  object FASTGRID extends TopLevel[FASTGRID with Double]
  
  /* 1 */ @js.native
  object GRID extends TopLevel[GRID with Double]
  
}

