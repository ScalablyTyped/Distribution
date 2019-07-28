package typings.jointjs.jointjsMod

import org.scalablytyped.runtime.StringDictionary
import typings.jointjs.jointjsMod.connectorsNs.ConnectorType
import typings.jointjs.jointjsMod.connectorsNs.GenericConnector
import typings.jointjs.jointjsMod.connectorsNs.GenericConnectorArguments
import typings.jointjs.jointjsMod.connectorsNs.GenericConnectorJSON
import typings.jointjs.jointjsMod.connectorsNs.JumpOverConnectorArguments
import typings.jointjs.jointjsMod.connectorsNs.NormalConnectorArguments
import typings.jointjs.jointjsMod.connectorsNs.RoundedConnectorArguments
import typings.jointjs.jointjsMod.connectorsNs.SmoothConnectorArguments
import typings.jointjs.jointjsMod.diaNs.Point
import typings.jointjs.jointjsMod.gNs.Path
import typings.jointjs.jointjsStrings.arc
import typings.jointjs.jointjsStrings.cubic
import typings.jointjs.jointjsStrings.gap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jointjs", "connectors")
@js.native
object connectorsNs extends js.Object {
  trait ConnectorArgumentsMap
    extends /* key */ StringDictionary[StringDictionary[js.Any]] {
    var jumpover: JumpOverConnectorArguments
    var normal: NormalConnectorArguments
    var rounded: RoundedConnectorArguments
    var smooth: SmoothConnectorArguments
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.jointjs.jointjsStrings.normal
    - typings.jointjs.jointjsStrings.rounded
    - typings.jointjs.jointjsStrings.smooth
    - typings.jointjs.jointjsStrings.jumpover
  */
  trait ConnectorType extends js.Object
  
  trait GenericConnectorJSON[K /* <: ConnectorType */] extends js.Object {
    var args: js.UndefOr[GenericConnectorArguments[K]] = js.undefined
    var name: K
  }
  
  trait JumpOverConnectorArguments extends js.Object {
    var jump: js.UndefOr[arc | gap | cubic] = js.undefined
    var raw: js.UndefOr[Boolean] = js.undefined
    var size: js.UndefOr[Double] = js.undefined
  }
  
  trait NormalConnectorArguments extends js.Object {
    var raw: js.UndefOr[Boolean] = js.undefined
  }
  
  trait RoundedConnectorArguments extends js.Object {
    var radius: js.UndefOr[Double] = js.undefined
    var raw: js.UndefOr[Boolean] = js.undefined
  }
  
  trait SmoothConnectorArguments extends js.Object {
    var raw: js.UndefOr[Boolean] = js.undefined
  }
  
  var jumpover: GenericConnector[typings.jointjs.jointjsStrings.jumpover] = js.native
  var normal: GenericConnector[typings.jointjs.jointjsStrings.normal] = js.native
  var rounded: GenericConnector[typings.jointjs.jointjsStrings.rounded] = js.native
  var smooth: GenericConnector[typings.jointjs.jointjsStrings.smooth] = js.native
  type Connector = GenericConnector[ConnectorType]
  type ConnectorArguments = GenericConnectorArguments[ConnectorType]
  type ConnectorJSON = GenericConnectorJSON[ConnectorType]
  type GenericConnector[K /* <: ConnectorType */] = js.Function4[
    /* sourcePoint */ Point, 
    /* targetPoint */ Point, 
    /* routePoints */ js.Array[Point], 
    /* args */ js.UndefOr[GenericConnectorArguments[K]], 
    String | Path
  ]
  type GenericConnectorArguments[K /* <: ConnectorType */] = /* import warning: ImportType.apply Failed type conversion: jointjs.jointjs.connectors.ConnectorArgumentsMap[K] */ js.Any
}

