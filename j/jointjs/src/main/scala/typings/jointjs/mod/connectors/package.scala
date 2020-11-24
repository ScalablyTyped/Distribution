package typings.jointjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object connectors {
  
  type Connector = typings.jointjs.mod.connectors.GenericConnector[typings.jointjs.mod.connectors.ConnectorType]
  
  type ConnectorJSON = typings.jointjs.mod.connectors.GenericConnectorJSON[typings.jointjs.mod.connectors.ConnectorType]
  
  type GenericConnector[K /* <: typings.jointjs.mod.connectors.ConnectorType */] = js.Function4[
    /* sourcePoint */ typings.jointjs.mod.dia.Point, 
    /* targetPoint */ typings.jointjs.mod.dia.Point, 
    /* routePoints */ js.Array[typings.jointjs.mod.dia.Point], 
    /* args */ js.UndefOr[typings.jointjs.mod.connectors.GenericConnectorArguments[K]], 
    java.lang.String | typings.jointjs.mod.g.Path
  ]
  
  type GenericConnectorArguments[K /* <: typings.jointjs.mod.connectors.ConnectorType */] = /* import warning: importer.ImportType#apply Failed type conversion: jointjs.jointjs.connectors.ConnectorArgumentsMap[K] */ js.Any
}
