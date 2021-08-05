package typings.jointjs.mod

import org.scalablytyped.runtime.StringDictionary
import typings.jointjs.jointjsStrings.manhattan
import typings.jointjs.jointjsStrings.metro
import typings.jointjs.jointjsStrings.normal
import typings.jointjs.jointjsStrings.oneSide
import typings.jointjs.jointjsStrings.orthogonal
import typings.jointjs.mod.dia.LinkEnd
import typings.jointjs.mod.dia.LinkView
import typings.jointjs.mod.dia.OrthogonalDirection
import typings.jointjs.mod.dia.Point
import typings.jointjs.mod.dia.Sides
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object routers {
  
  @JSImport("jointjs", "routers")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("jointjs", "routers.manhattan")
  @js.native
  def manhattan: GenericRouter[typings.jointjs.jointjsStrings.manhattan] = js.native
  inline def manhattan_=(x: GenericRouter[manhattan]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("manhattan")(x.asInstanceOf[js.Any])
  
  @JSImport("jointjs", "routers.metro")
  @js.native
  def metro: GenericRouter[typings.jointjs.jointjsStrings.metro] = js.native
  inline def metro_=(x: GenericRouter[metro]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("metro")(x.asInstanceOf[js.Any])
  
  @JSImport("jointjs", "routers.normal")
  @js.native
  def normal: GenericRouter[typings.jointjs.jointjsStrings.normal] = js.native
  inline def normal_=(x: GenericRouter[normal]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("normal")(x.asInstanceOf[js.Any])
  
  @JSImport("jointjs", "routers.oneSide")
  @js.native
  def oneSide: GenericRouter[typings.jointjs.jointjsStrings.oneSide] = js.native
  inline def oneSide_=(x: GenericRouter[oneSide]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("oneSide")(x.asInstanceOf[js.Any])
  
  @JSImport("jointjs", "routers.orthogonal")
  @js.native
  def orthogonal: GenericRouter[typings.jointjs.jointjsStrings.orthogonal] = js.native
  inline def orthogonal_=(x: GenericRouter[orthogonal]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("orthogonal")(x.asInstanceOf[js.Any])
  
  type GenericRouter[K /* <: RouterType */] = js.Function3[
    /* vertices */ js.Array[Point], 
    /* args */ js.UndefOr[GenericRouterArguments[K]], 
    /* linkView */ js.UndefOr[LinkView], 
    js.Array[Point]
  ]
  
  type GenericRouterArguments[K /* <: RouterType */] = /* import warning: importer.ImportType#apply Failed type conversion: jointjs.jointjs.routers.RouterArgumentsMap[K] */ js.Any
  
  trait GenericRouterJSON[K /* <: RouterType */] extends StObject {
    
    var args: js.UndefOr[GenericRouterArguments[K]] = js.undefined
    
    var name: K
  }
  object GenericRouterJSON {
    
    inline def apply[K /* <: RouterType */](name: K): GenericRouterJSON[K] = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[GenericRouterJSON[K]]
    }
    
    extension [Self <: GenericRouterJSON[?], K /* <: RouterType */](x: Self & GenericRouterJSON[K]) {
      
      inline def setArgs(value: GenericRouterArguments[K]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      inline def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
      
      inline def setName(value: K): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait ManhattanRouterArguments extends StObject {
    
    var endDirections: js.UndefOr[js.Array[OrthogonalDirection]] = js.undefined
    
    var excludeEnds: js.UndefOr[js.Array[LinkEnd]] = js.undefined
    
    var excludeTypes: js.UndefOr[js.Array[String]] = js.undefined
    
    var maxAllowedDirectionChange: js.UndefOr[Double] = js.undefined
    
    var maximumLoops: js.UndefOr[Double] = js.undefined
    
    var padding: js.UndefOr[Sides] = js.undefined
    
    var perpendicular: js.UndefOr[Boolean] = js.undefined
    
    var startDirections: js.UndefOr[js.Array[OrthogonalDirection]] = js.undefined
    
    var step: js.UndefOr[Double] = js.undefined
  }
  object ManhattanRouterArguments {
    
    inline def apply(): ManhattanRouterArguments = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ManhattanRouterArguments]
    }
    
    extension [Self <: ManhattanRouterArguments](x: Self) {
      
      inline def setEndDirections(value: js.Array[OrthogonalDirection]): Self = StObject.set(x, "endDirections", value.asInstanceOf[js.Any])
      
      inline def setEndDirectionsUndefined: Self = StObject.set(x, "endDirections", js.undefined)
      
      inline def setEndDirectionsVarargs(value: OrthogonalDirection*): Self = StObject.set(x, "endDirections", js.Array(value :_*))
      
      inline def setExcludeEnds(value: js.Array[LinkEnd]): Self = StObject.set(x, "excludeEnds", value.asInstanceOf[js.Any])
      
      inline def setExcludeEndsUndefined: Self = StObject.set(x, "excludeEnds", js.undefined)
      
      inline def setExcludeEndsVarargs(value: LinkEnd*): Self = StObject.set(x, "excludeEnds", js.Array(value :_*))
      
      inline def setExcludeTypes(value: js.Array[String]): Self = StObject.set(x, "excludeTypes", value.asInstanceOf[js.Any])
      
      inline def setExcludeTypesUndefined: Self = StObject.set(x, "excludeTypes", js.undefined)
      
      inline def setExcludeTypesVarargs(value: String*): Self = StObject.set(x, "excludeTypes", js.Array(value :_*))
      
      inline def setMaxAllowedDirectionChange(value: Double): Self = StObject.set(x, "maxAllowedDirectionChange", value.asInstanceOf[js.Any])
      
      inline def setMaxAllowedDirectionChangeUndefined: Self = StObject.set(x, "maxAllowedDirectionChange", js.undefined)
      
      inline def setMaximumLoops(value: Double): Self = StObject.set(x, "maximumLoops", value.asInstanceOf[js.Any])
      
      inline def setMaximumLoopsUndefined: Self = StObject.set(x, "maximumLoops", js.undefined)
      
      inline def setPadding(value: Sides): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
      
      inline def setPerpendicular(value: Boolean): Self = StObject.set(x, "perpendicular", value.asInstanceOf[js.Any])
      
      inline def setPerpendicularUndefined: Self = StObject.set(x, "perpendicular", js.undefined)
      
      inline def setStartDirections(value: js.Array[OrthogonalDirection]): Self = StObject.set(x, "startDirections", value.asInstanceOf[js.Any])
      
      inline def setStartDirectionsUndefined: Self = StObject.set(x, "startDirections", js.undefined)
      
      inline def setStartDirectionsVarargs(value: OrthogonalDirection*): Self = StObject.set(x, "startDirections", js.Array(value :_*))
      
      inline def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
      
      inline def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
    }
  }
  
  trait NormalRouterArguments extends StObject
  
  trait OneSideRouterArguments extends StObject {
    
    var padding: js.UndefOr[Sides] = js.undefined
    
    var side: js.UndefOr[OrthogonalDirection] = js.undefined
  }
  object OneSideRouterArguments {
    
    inline def apply(): OneSideRouterArguments = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OneSideRouterArguments]
    }
    
    extension [Self <: OneSideRouterArguments](x: Self) {
      
      inline def setPadding(value: Sides): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
      
      inline def setSide(value: OrthogonalDirection): Self = StObject.set(x, "side", value.asInstanceOf[js.Any])
      
      inline def setSideUndefined: Self = StObject.set(x, "side", js.undefined)
    }
  }
  
  trait OrthogonalRouterArguments extends StObject {
    
    var elementPadding: js.UndefOr[Double] = js.undefined
    
    var padding: js.UndefOr[Sides] = js.undefined
  }
  object OrthogonalRouterArguments {
    
    inline def apply(): OrthogonalRouterArguments = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OrthogonalRouterArguments]
    }
    
    extension [Self <: OrthogonalRouterArguments](x: Self) {
      
      inline def setElementPadding(value: Double): Self = StObject.set(x, "elementPadding", value.asInstanceOf[js.Any])
      
      inline def setElementPaddingUndefined: Self = StObject.set(x, "elementPadding", js.undefined)
      
      inline def setPadding(value: Sides): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    }
  }
  
  type Router = GenericRouter[RouterType]
  
  /* Inlined jointjs.jointjs.routers.GenericRouterArguments<jointjs.jointjs.routers.RouterType> */
  /* Rewritten from type alias, can be one of: 
    - typings.jointjs.jointjsStrings.excludeTypes
    - typings.jointjs.jointjsStrings.maxAllowedDirectionChange
    - typings.jointjs.jointjsStrings.startDirections
    - typings.jointjs.jointjsStrings.elementPadding
    - typings.jointjs.jointjsStrings.maximumLoops
    - typings.jointjs.jointjsStrings.step
    - typings.jointjs.jointjsStrings.padding
    - typings.jointjs.jointjsStrings.endDirections
    - typings.jointjs.jointjsStrings.perpendicular
    - typings.jointjs.jointjsStrings.excludeEnds
    - typings.jointjs.jointjsStrings.side
  */
  trait RouterArguments extends StObject
  object RouterArguments {
    
    inline def elementPadding: typings.jointjs.jointjsStrings.elementPadding = "elementPadding".asInstanceOf[typings.jointjs.jointjsStrings.elementPadding]
    
    inline def endDirections: typings.jointjs.jointjsStrings.endDirections = "endDirections".asInstanceOf[typings.jointjs.jointjsStrings.endDirections]
    
    inline def excludeEnds: typings.jointjs.jointjsStrings.excludeEnds = "excludeEnds".asInstanceOf[typings.jointjs.jointjsStrings.excludeEnds]
    
    inline def excludeTypes: typings.jointjs.jointjsStrings.excludeTypes = "excludeTypes".asInstanceOf[typings.jointjs.jointjsStrings.excludeTypes]
    
    inline def maxAllowedDirectionChange: typings.jointjs.jointjsStrings.maxAllowedDirectionChange = "maxAllowedDirectionChange".asInstanceOf[typings.jointjs.jointjsStrings.maxAllowedDirectionChange]
    
    inline def maximumLoops: typings.jointjs.jointjsStrings.maximumLoops = "maximumLoops".asInstanceOf[typings.jointjs.jointjsStrings.maximumLoops]
    
    inline def padding: typings.jointjs.jointjsStrings.padding = "padding".asInstanceOf[typings.jointjs.jointjsStrings.padding]
    
    inline def perpendicular: typings.jointjs.jointjsStrings.perpendicular = "perpendicular".asInstanceOf[typings.jointjs.jointjsStrings.perpendicular]
    
    inline def side: typings.jointjs.jointjsStrings.side = "side".asInstanceOf[typings.jointjs.jointjsStrings.side]
    
    inline def startDirections: typings.jointjs.jointjsStrings.startDirections = "startDirections".asInstanceOf[typings.jointjs.jointjsStrings.startDirections]
    
    inline def step: typings.jointjs.jointjsStrings.step = "step".asInstanceOf[typings.jointjs.jointjsStrings.step]
  }
  
  trait RouterArgumentsMap
    extends StObject
       with /* key */ StringDictionary[StringDictionary[js.Any]] {
    
    var manhattan: ManhattanRouterArguments
    
    var metro: ManhattanRouterArguments
    
    var normal: NormalRouterArguments
    
    var oneSide: OneSideRouterArguments
    
    var orthogonal: OrthogonalRouterArguments
  }
  object RouterArgumentsMap {
    
    inline def apply(
      manhattan: ManhattanRouterArguments,
      metro: ManhattanRouterArguments,
      normal: NormalRouterArguments,
      oneSide: OneSideRouterArguments,
      orthogonal: OrthogonalRouterArguments
    ): RouterArgumentsMap = {
      val __obj = js.Dynamic.literal(manhattan = manhattan.asInstanceOf[js.Any], metro = metro.asInstanceOf[js.Any], normal = normal.asInstanceOf[js.Any], oneSide = oneSide.asInstanceOf[js.Any], orthogonal = orthogonal.asInstanceOf[js.Any])
      __obj.asInstanceOf[RouterArgumentsMap]
    }
    
    extension [Self <: RouterArgumentsMap](x: Self) {
      
      inline def setManhattan(value: ManhattanRouterArguments): Self = StObject.set(x, "manhattan", value.asInstanceOf[js.Any])
      
      inline def setMetro(value: ManhattanRouterArguments): Self = StObject.set(x, "metro", value.asInstanceOf[js.Any])
      
      inline def setNormal(value: NormalRouterArguments): Self = StObject.set(x, "normal", value.asInstanceOf[js.Any])
      
      inline def setOneSide(value: OneSideRouterArguments): Self = StObject.set(x, "oneSide", value.asInstanceOf[js.Any])
      
      inline def setOrthogonal(value: OrthogonalRouterArguments): Self = StObject.set(x, "orthogonal", value.asInstanceOf[js.Any])
    }
  }
  
  type RouterJSON = GenericRouterJSON[RouterType]
  
  /* Rewritten from type alias, can be one of: 
    - typings.jointjs.jointjsStrings.normal
    - typings.jointjs.jointjsStrings.manhattan
    - typings.jointjs.jointjsStrings.metro
    - typings.jointjs.jointjsStrings.orthogonal
    - typings.jointjs.jointjsStrings.oneSide
  */
  trait RouterType extends StObject
}
