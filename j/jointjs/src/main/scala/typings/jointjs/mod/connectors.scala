package typings.jointjs.mod

import org.scalablytyped.runtime.StringDictionary
import typings.jointjs.jointjsStrings.arc
import typings.jointjs.jointjsStrings.cubic
import typings.jointjs.jointjsStrings.gap
import typings.jointjs.jointjsStrings.jumpover
import typings.jointjs.jointjsStrings.normal
import typings.jointjs.jointjsStrings.rounded
import typings.jointjs.jointjsStrings.smooth
import typings.jointjs.mod.dia.Point
import typings.jointjs.mod.g.Path
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object connectors {
  
  @JSImport("jointjs", "connectors")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("jointjs", "connectors.jumpover")
  @js.native
  def jumpover: GenericConnector[typings.jointjs.jointjsStrings.jumpover] = js.native
  inline def jumpover_=(x: GenericConnector[jumpover]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("jumpover")(x.asInstanceOf[js.Any])
  
  @JSImport("jointjs", "connectors.normal")
  @js.native
  def normal: GenericConnector[typings.jointjs.jointjsStrings.normal] = js.native
  inline def normal_=(x: GenericConnector[normal]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("normal")(x.asInstanceOf[js.Any])
  
  @JSImport("jointjs", "connectors.rounded")
  @js.native
  def rounded: GenericConnector[typings.jointjs.jointjsStrings.rounded] = js.native
  inline def rounded_=(x: GenericConnector[rounded]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rounded")(x.asInstanceOf[js.Any])
  
  @JSImport("jointjs", "connectors.smooth")
  @js.native
  def smooth: GenericConnector[typings.jointjs.jointjsStrings.smooth] = js.native
  inline def smooth_=(x: GenericConnector[smooth]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("smooth")(x.asInstanceOf[js.Any])
  
  type Connector = GenericConnector[ConnectorType]
  
  /* Inlined jointjs.jointjs.connectors.GenericConnectorArguments<jointjs.jointjs.connectors.ConnectorType> */
  /* Rewritten from type alias, can be one of: 
    - typings.jointjs.jointjsStrings.raw
    - typings.jointjs.jointjsStrings.radius
    - typings.jointjs.jointjsStrings.size
    - typings.jointjs.jointjsStrings.jump
  */
  trait ConnectorArguments extends StObject
  object ConnectorArguments {
    
    inline def jump: typings.jointjs.jointjsStrings.jump = "jump".asInstanceOf[typings.jointjs.jointjsStrings.jump]
    
    inline def radius: typings.jointjs.jointjsStrings.radius = "radius".asInstanceOf[typings.jointjs.jointjsStrings.radius]
    
    inline def raw: typings.jointjs.jointjsStrings.raw = "raw".asInstanceOf[typings.jointjs.jointjsStrings.raw]
    
    inline def size: typings.jointjs.jointjsStrings.size = "size".asInstanceOf[typings.jointjs.jointjsStrings.size]
  }
  
  trait ConnectorArgumentsMap
    extends StObject
       with /* key */ StringDictionary[StringDictionary[js.Any]] {
    
    var jumpover: JumpOverConnectorArguments
    
    var normal: NormalConnectorArguments
    
    var rounded: RoundedConnectorArguments
    
    var smooth: SmoothConnectorArguments
  }
  object ConnectorArgumentsMap {
    
    inline def apply(
      jumpover: JumpOverConnectorArguments,
      normal: NormalConnectorArguments,
      rounded: RoundedConnectorArguments,
      smooth: SmoothConnectorArguments
    ): ConnectorArgumentsMap = {
      val __obj = js.Dynamic.literal(jumpover = jumpover.asInstanceOf[js.Any], normal = normal.asInstanceOf[js.Any], rounded = rounded.asInstanceOf[js.Any], smooth = smooth.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConnectorArgumentsMap]
    }
    
    extension [Self <: ConnectorArgumentsMap](x: Self) {
      
      inline def setJumpover(value: JumpOverConnectorArguments): Self = StObject.set(x, "jumpover", value.asInstanceOf[js.Any])
      
      inline def setNormal(value: NormalConnectorArguments): Self = StObject.set(x, "normal", value.asInstanceOf[js.Any])
      
      inline def setRounded(value: RoundedConnectorArguments): Self = StObject.set(x, "rounded", value.asInstanceOf[js.Any])
      
      inline def setSmooth(value: SmoothConnectorArguments): Self = StObject.set(x, "smooth", value.asInstanceOf[js.Any])
    }
  }
  
  type ConnectorJSON = GenericConnectorJSON[ConnectorType]
  
  /* Rewritten from type alias, can be one of: 
    - typings.jointjs.jointjsStrings.normal
    - typings.jointjs.jointjsStrings.rounded
    - typings.jointjs.jointjsStrings.smooth
    - typings.jointjs.jointjsStrings.jumpover
  */
  trait ConnectorType extends StObject
  
  type GenericConnector[K /* <: ConnectorType */] = js.Function4[
    /* sourcePoint */ Point, 
    /* targetPoint */ Point, 
    /* routePoints */ js.Array[Point], 
    /* args */ js.UndefOr[GenericConnectorArguments[K]], 
    String | Path
  ]
  
  type GenericConnectorArguments[K /* <: ConnectorType */] = /* import warning: importer.ImportType#apply Failed type conversion: jointjs.jointjs.connectors.ConnectorArgumentsMap[K] */ js.Any
  
  trait GenericConnectorJSON[K /* <: ConnectorType */] extends StObject {
    
    var args: js.UndefOr[GenericConnectorArguments[K]] = js.undefined
    
    var name: K
  }
  object GenericConnectorJSON {
    
    inline def apply[K /* <: ConnectorType */](name: K): GenericConnectorJSON[K] = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[GenericConnectorJSON[K]]
    }
    
    extension [Self <: GenericConnectorJSON[?], K /* <: ConnectorType */](x: Self & GenericConnectorJSON[K]) {
      
      inline def setArgs(value: GenericConnectorArguments[K]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      inline def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
      
      inline def setName(value: K): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait JumpOverConnectorArguments extends StObject {
    
    var jump: js.UndefOr[arc | gap | cubic] = js.undefined
    
    var radius: js.UndefOr[Double] = js.undefined
    
    var raw: js.UndefOr[Boolean] = js.undefined
    
    var size: js.UndefOr[Double] = js.undefined
  }
  object JumpOverConnectorArguments {
    
    inline def apply(): JumpOverConnectorArguments = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[JumpOverConnectorArguments]
    }
    
    extension [Self <: JumpOverConnectorArguments](x: Self) {
      
      inline def setJump(value: arc | gap | cubic): Self = StObject.set(x, "jump", value.asInstanceOf[js.Any])
      
      inline def setJumpUndefined: Self = StObject.set(x, "jump", js.undefined)
      
      inline def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
      
      inline def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
      
      inline def setRaw(value: Boolean): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
      
      inline def setRawUndefined: Self = StObject.set(x, "raw", js.undefined)
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  trait NormalConnectorArguments extends StObject {
    
    var raw: js.UndefOr[Boolean] = js.undefined
  }
  object NormalConnectorArguments {
    
    inline def apply(): NormalConnectorArguments = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NormalConnectorArguments]
    }
    
    extension [Self <: NormalConnectorArguments](x: Self) {
      
      inline def setRaw(value: Boolean): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
      
      inline def setRawUndefined: Self = StObject.set(x, "raw", js.undefined)
    }
  }
  
  trait RoundedConnectorArguments extends StObject {
    
    var radius: js.UndefOr[Double] = js.undefined
    
    var raw: js.UndefOr[Boolean] = js.undefined
  }
  object RoundedConnectorArguments {
    
    inline def apply(): RoundedConnectorArguments = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RoundedConnectorArguments]
    }
    
    extension [Self <: RoundedConnectorArguments](x: Self) {
      
      inline def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
      
      inline def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
      
      inline def setRaw(value: Boolean): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
      
      inline def setRawUndefined: Self = StObject.set(x, "raw", js.undefined)
    }
  }
  
  trait SmoothConnectorArguments extends StObject {
    
    var raw: js.UndefOr[Boolean] = js.undefined
  }
  object SmoothConnectorArguments {
    
    inline def apply(): SmoothConnectorArguments = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SmoothConnectorArguments]
    }
    
    extension [Self <: SmoothConnectorArguments](x: Self) {
      
      inline def setRaw(value: Boolean): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
      
      inline def setRawUndefined: Self = StObject.set(x, "raw", js.undefined)
    }
  }
}
