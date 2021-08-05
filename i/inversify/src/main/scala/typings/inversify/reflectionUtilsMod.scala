package typings.inversify

import typings.inversify.interfacesMod.interfaces.MetadataReader
import typings.inversify.interfacesMod.interfaces.Target
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reflectionUtilsMod {
  
  @JSImport("inversify/dts/planning/reflection_utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getBaseClassDependencyCount(metadataReader: MetadataReader, func: js.Function): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getBaseClassDependencyCount")(metadataReader.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def getDependencies(metadataReader: MetadataReader, func: js.Function): js.Array[Target] = (^.asInstanceOf[js.Dynamic].applyDynamic("getDependencies")(metadataReader.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[js.Array[Target]]
  
  inline def getFunctionName(v: js.Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getFunctionName")(v.asInstanceOf[js.Any]).asInstanceOf[String]
}
