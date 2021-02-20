package typings.inversify

import typings.inversify.interfacesMod.interfaces.MetadataReader
import typings.inversify.interfacesMod.interfaces.Target
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reflectionUtilsMod {
  
  @JSImport("inversify/dts/planning/reflection_utils", "getBaseClassDependencyCount")
  @js.native
  def getBaseClassDependencyCount(metadataReader: MetadataReader, func: js.Function): Double = js.native
  
  @JSImport("inversify/dts/planning/reflection_utils", "getDependencies")
  @js.native
  def getDependencies(metadataReader: MetadataReader, func: js.Function): js.Array[Target] = js.native
  
  @JSImport("inversify/dts/planning/reflection_utils", "getFunctionName")
  @js.native
  def getFunctionName(v: js.Any): String = js.native
}
