package typings
package jointjsLib.jointjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jointjs", "connectors")
@js.native
object connectorsNs extends js.Object {
  trait ConnectorArgumentsMap
    extends /* key */ org.scalablytyped.runtime.StringDictionary[org.scalablytyped.runtime.StringDictionary[js.Any]] {
    var jumpover: JumpOverConnectorArguments
    var normal: NormalConnectorArguments
    var rounded: RoundedConnectorArguments
    var smooth: SmoothConnectorArguments
  }
  
  trait ConnectorType extends js.Object
  
  trait GenericConnectorJSON[K /* <: ConnectorType */] extends js.Object {
    var args: js.UndefOr[GenericConnectorArguments[K]] = js.undefined
    var name: K
  }
  
  trait JumpOverConnectorArguments extends js.Object {
    var jump: js.UndefOr[
        jointjsLib.jointjsLibStrings.arc | jointjsLib.jointjsLibStrings.gap | jointjsLib.jointjsLibStrings.cubic
      ] = js.undefined
    var raw: js.UndefOr[scala.Boolean] = js.undefined
    var size: js.UndefOr[scala.Double] = js.undefined
  }
  
  trait NormalConnectorArguments extends js.Object {
    var raw: js.UndefOr[scala.Boolean] = js.undefined
  }
  
  trait RoundedConnectorArguments extends js.Object {
    var radius: js.UndefOr[scala.Double] = js.undefined
    var raw: js.UndefOr[scala.Boolean] = js.undefined
  }
  
  trait SmoothConnectorArguments extends js.Object {
    var raw: js.UndefOr[scala.Boolean] = js.undefined
  }
  
  var jumpover: GenericConnector[jointjsLib.jointjsLibStrings.jumpover] = js.native
  var normal: GenericConnector[jointjsLib.jointjsLibStrings.normal] = js.native
  var rounded: GenericConnector[jointjsLib.jointjsLibStrings.rounded] = js.native
  var smooth: GenericConnector[jointjsLib.jointjsLibStrings.smooth] = js.native
  type Connector = GenericConnector[ConnectorType]
  type ConnectorArguments = GenericConnectorArguments[ConnectorType]
  type ConnectorJSON = GenericConnectorJSON[ConnectorType]
  type GenericConnector[K /* <: ConnectorType */] = js.Function4[
    /* sourcePoint */ jointjsLib.jointjsMod.diaNs.Point, 
    /* targetPoint */ jointjsLib.jointjsMod.diaNs.Point, 
    /* routePoints */ js.Array[jointjsLib.jointjsMod.diaNs.Point], 
    /* args */ js.UndefOr[GenericConnectorArguments[K]], 
    java.lang.String | jointjsLib.jointjsMod.gNs.Path
  ]
  type GenericConnectorArguments[K /* <: ConnectorType */] = /* import warning: ImportType.apply Failed type conversion: jointjs.jointjs.connectors.ConnectorArgumentsMap[K] */ js.Any
}

