package typings.makerJs.MakerJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object measure {
  
  /**
    * A list of maps of measurements.
    *
    * @param modelToMeasure The model to measure.
    * @param atlas Optional atlas to save measurements.
    * @returns object with low and high points.
    */
  @js.native
  trait Atlas extends StObject {
    
    def measureModels(): Unit = js.native
    
    var modelContext: IModel = js.native
    
    /**
      * Map of model measurements, mapped by routeKey.
      */
    var modelMap: IMeasureMap = js.native
    
    /**
      * Flag that models have been measured.
      */
    var modelsMeasured: Boolean = js.native
    
    /**
      * Map of path measurements, mapped by routeKey.
      */
    var pathMap: IMeasureMap = js.native
  }
  object Atlas {
    
    @scala.inline
    def apply(
      measureModels: () => Unit,
      modelContext: IModel,
      modelMap: IMeasureMap,
      modelsMeasured: Boolean,
      pathMap: IMeasureMap
    ): Atlas = {
      val __obj = js.Dynamic.literal(measureModels = js.Any.fromFunction0(measureModels), modelContext = modelContext.asInstanceOf[js.Any], modelMap = modelMap.asInstanceOf[js.Any], modelsMeasured = modelsMeasured.asInstanceOf[js.Any], pathMap = pathMap.asInstanceOf[js.Any])
      __obj.asInstanceOf[Atlas]
    }
    
    @scala.inline
    implicit class AtlasMutableBuilder[Self <: Atlas] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMeasureModels(value: () => Unit): Self = StObject.set(x, "measureModels", js.Any.fromFunction0(value))
      
      @scala.inline
      def setModelContext(value: IModel): Self = StObject.set(x, "modelContext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelMap(value: IMeasureMap): Self = StObject.set(x, "modelMap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelsMeasured(value: Boolean): Self = StObject.set(x, "modelsMeasured", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathMap(value: IMeasureMap): Self = StObject.set(x, "pathMap", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * A hexagon which surrounds a model.
    */
  @js.native
  trait IBoundingHex extends IModel {
    
    /**
      * Radius of the hexagon, which is also the length of a side.
      */
    var radius: Double = js.native
  }
  object IBoundingHex {
    
    @scala.inline
    def apply(radius: Double): IBoundingHex = {
      val __obj = js.Dynamic.literal(radius = radius.asInstanceOf[js.Any])
      __obj.asInstanceOf[IBoundingHex]
    }
    
    @scala.inline
    implicit class IBoundingHexMutableBuilder[Self <: IBoundingHex] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    }
  }
}
