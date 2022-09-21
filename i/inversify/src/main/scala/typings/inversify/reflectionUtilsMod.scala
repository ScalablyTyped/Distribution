package typings.inversify

import typings.inversify.anon.Name
import typings.inversify.interfacesMod.interfaces.MetadataReader
import typings.inversify.interfacesMod.interfaces.Target
import typings.std.NewableFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reflectionUtilsMod {
  
  @JSImport("inversify/lib/planning/reflection_utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getBaseClassDependencyCount(metadataReader: MetadataReader, func: NewableFunction): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getBaseClassDependencyCount")(metadataReader.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def getDependencies(metadataReader: MetadataReader, func: NewableFunction): js.Array[Target] = (^.asInstanceOf[js.Dynamic].applyDynamic("getDependencies")(metadataReader.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[js.Array[Target]]
  
  inline def getFunctionName(func: Name): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getFunctionName")(func.asInstanceOf[js.Any]).asInstanceOf[String]
}
