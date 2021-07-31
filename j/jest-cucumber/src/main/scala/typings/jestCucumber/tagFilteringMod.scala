package typings.jestCucumber

import typings.jestCucumber.modelsMod.ParsedFeature
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tagFilteringMod {
  
  @JSImport("jest-cucumber/dist/src/tag-filtering", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def applyTagFilters(parsedFeature: ParsedFeature): ParsedFeature = ^.asInstanceOf[js.Dynamic].applyDynamic("applyTagFilters")(parsedFeature.asInstanceOf[js.Any]).asInstanceOf[ParsedFeature]
}
