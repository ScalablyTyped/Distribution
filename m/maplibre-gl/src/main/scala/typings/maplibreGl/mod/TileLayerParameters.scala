package typings.maplibreGl.mod

import typings.glMatrix.mod.mat4
import typings.maplibreGl.anon.USize
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TileLayerParameters extends StObject {
  
  var bucket: SymbolBucket
  
  var collisionBoxArray: CollisionBoxArray
  
  var collisionGroup: CollisionGroup
  
  var holdingForFade: Boolean
  
  var labelToScreenMatrix: mat4
  
  var layout: PossiblyEvaluated[SymbolLayoutProps, SymbolLayoutPropsPossiblyEvaluated]
  
  var partiallyEvaluatedTextSize: USize
  
  var posMatrix: mat4
  
  var scale: Double
  
  var textLabelPlaneMatrix: mat4
  
  var textPixelRatio: Double
}
object TileLayerParameters {
  
  inline def apply(
    bucket: SymbolBucket,
    collisionBoxArray: CollisionBoxArray,
    collisionGroup: CollisionGroup,
    holdingForFade: Boolean,
    labelToScreenMatrix: mat4,
    layout: PossiblyEvaluated[SymbolLayoutProps, SymbolLayoutPropsPossiblyEvaluated],
    partiallyEvaluatedTextSize: USize,
    posMatrix: mat4,
    scale: Double,
    textLabelPlaneMatrix: mat4,
    textPixelRatio: Double
  ): TileLayerParameters = {
    val __obj = js.Dynamic.literal(bucket = bucket.asInstanceOf[js.Any], collisionBoxArray = collisionBoxArray.asInstanceOf[js.Any], collisionGroup = collisionGroup.asInstanceOf[js.Any], holdingForFade = holdingForFade.asInstanceOf[js.Any], labelToScreenMatrix = labelToScreenMatrix.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any], partiallyEvaluatedTextSize = partiallyEvaluatedTextSize.asInstanceOf[js.Any], posMatrix = posMatrix.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], textLabelPlaneMatrix = textLabelPlaneMatrix.asInstanceOf[js.Any], textPixelRatio = textPixelRatio.asInstanceOf[js.Any])
    __obj.asInstanceOf[TileLayerParameters]
  }
  
  extension [Self <: TileLayerParameters](x: Self) {
    
    inline def setBucket(value: SymbolBucket): Self = StObject.set(x, "bucket", value.asInstanceOf[js.Any])
    
    inline def setCollisionBoxArray(value: CollisionBoxArray): Self = StObject.set(x, "collisionBoxArray", value.asInstanceOf[js.Any])
    
    inline def setCollisionGroup(value: CollisionGroup): Self = StObject.set(x, "collisionGroup", value.asInstanceOf[js.Any])
    
    inline def setHoldingForFade(value: Boolean): Self = StObject.set(x, "holdingForFade", value.asInstanceOf[js.Any])
    
    inline def setLabelToScreenMatrix(value: mat4): Self = StObject.set(x, "labelToScreenMatrix", value.asInstanceOf[js.Any])
    
    inline def setLayout(value: PossiblyEvaluated[SymbolLayoutProps, SymbolLayoutPropsPossiblyEvaluated]): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    inline def setPartiallyEvaluatedTextSize(value: USize): Self = StObject.set(x, "partiallyEvaluatedTextSize", value.asInstanceOf[js.Any])
    
    inline def setPosMatrix(value: mat4): Self = StObject.set(x, "posMatrix", value.asInstanceOf[js.Any])
    
    inline def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    inline def setTextLabelPlaneMatrix(value: mat4): Self = StObject.set(x, "textLabelPlaneMatrix", value.asInstanceOf[js.Any])
    
    inline def setTextPixelRatio(value: Double): Self = StObject.set(x, "textPixelRatio", value.asInstanceOf[js.Any])
  }
}
