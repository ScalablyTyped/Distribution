package typings.lernaPackageGraph

import typings.lernaPackageGraph.mod.GraphType
import typings.lernaPackageGraph.mod.NodeProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lernaPackageGraphStrings {
  
  @js.native
  sealed trait allDependencies
    extends StObject
       with GraphType
  inline def allDependencies: allDependencies = "allDependencies".asInstanceOf[allDependencies]
  
  @js.native
  sealed trait dependencies
    extends StObject
       with GraphType
  inline def dependencies: dependencies = "dependencies".asInstanceOf[dependencies]
  
  @js.native
  sealed trait localDependencies
    extends StObject
       with NodeProperties
  inline def localDependencies: localDependencies = "localDependencies".asInstanceOf[localDependencies]
  
  @js.native
  sealed trait localDependents
    extends StObject
       with NodeProperties
  inline def localDependents: localDependents = "localDependents".asInstanceOf[localDependents]
}
