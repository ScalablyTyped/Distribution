package typings.jestTypes.globalMod

import typings.istanbulLibCoverage.mod.CoverageMapData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GlobalAdditions extends TestFrameworkGlobals {
  
  var __coverage__ : CoverageMapData = js.native
  
  def fail(): Unit = js.native
  
  var jasmine: Jasmine = js.native
  
  def pending(): Unit = js.native
  
  def spyOn(): Unit = js.native
  
  def spyOnProperty(): Unit = js.native
}
