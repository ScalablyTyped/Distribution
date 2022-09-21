package typings.kahootJsUpdated.anon

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import typings.kahootJsUpdated.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LiveClientHandshake extends StObject {
  
  var LiveClientHandshake: Instantiable3[
    /* number */ String | Double, 
    /* message */ L, 
    /* client */ ^, 
    typings.kahootJsUpdated.liveClientHandshakeMod.^
  ]
  
  var LiveJoinPacket: Instantiable2[
    /* client */ ^, 
    /* name */ js.UndefOr[String], 
    typings.kahootJsUpdated.liveJoinPacketMod.^
  ]
  
  var LiveJoinTeamPacket: Instantiable2[
    /* client */ ^, 
    /* team */ js.Array[String], 
    typings.kahootJsUpdated.liveJoinTeamPacketMod.^
  ]
  
  var LiveLeavePacket: Instantiable1[/* client */ ^, typings.kahootJsUpdated.liveLeavePacketMod.^]
  
  var LiveTwoStepAnswer: Instantiable2[
    /* client */ ^, 
    /* sequence */ js.Array[Double], 
    typings.kahootJsUpdated.liveTwoStepAnswerMod.^
  ]
}
object LiveClientHandshake {
  
  inline def apply(
    LiveClientHandshake: Instantiable3[
      /* number */ String | Double, 
      /* message */ L, 
      /* client */ ^, 
      typings.kahootJsUpdated.liveClientHandshakeMod.^
    ],
    LiveJoinPacket: Instantiable2[
      /* client */ ^, 
      /* name */ js.UndefOr[String], 
      typings.kahootJsUpdated.liveJoinPacketMod.^
    ],
    LiveJoinTeamPacket: Instantiable2[
      /* client */ ^, 
      /* team */ js.Array[String], 
      typings.kahootJsUpdated.liveJoinTeamPacketMod.^
    ],
    LiveLeavePacket: Instantiable1[/* client */ ^, typings.kahootJsUpdated.liveLeavePacketMod.^],
    LiveTwoStepAnswer: Instantiable2[
      /* client */ ^, 
      /* sequence */ js.Array[Double], 
      typings.kahootJsUpdated.liveTwoStepAnswerMod.^
    ]
  ): LiveClientHandshake = {
    val __obj = js.Dynamic.literal(LiveClientHandshake = LiveClientHandshake.asInstanceOf[js.Any], LiveJoinPacket = LiveJoinPacket.asInstanceOf[js.Any], LiveJoinTeamPacket = LiveJoinTeamPacket.asInstanceOf[js.Any], LiveLeavePacket = LiveLeavePacket.asInstanceOf[js.Any], LiveTwoStepAnswer = LiveTwoStepAnswer.asInstanceOf[js.Any])
    __obj.asInstanceOf[LiveClientHandshake]
  }
  
  extension [Self <: LiveClientHandshake](x: Self) {
    
    inline def setLiveClientHandshake(
      value: Instantiable3[
          /* number */ String | Double, 
          /* message */ L, 
          /* client */ ^, 
          typings.kahootJsUpdated.liveClientHandshakeMod.^
        ]
    ): Self = StObject.set(x, "LiveClientHandshake", value.asInstanceOf[js.Any])
    
    inline def setLiveJoinPacket(
      value: Instantiable2[
          /* client */ ^, 
          /* name */ js.UndefOr[String], 
          typings.kahootJsUpdated.liveJoinPacketMod.^
        ]
    ): Self = StObject.set(x, "LiveJoinPacket", value.asInstanceOf[js.Any])
    
    inline def setLiveJoinTeamPacket(
      value: Instantiable2[
          /* client */ ^, 
          /* team */ js.Array[String], 
          typings.kahootJsUpdated.liveJoinTeamPacketMod.^
        ]
    ): Self = StObject.set(x, "LiveJoinTeamPacket", value.asInstanceOf[js.Any])
    
    inline def setLiveLeavePacket(value: Instantiable1[/* client */ ^, typings.kahootJsUpdated.liveLeavePacketMod.^]): Self = StObject.set(x, "LiveLeavePacket", value.asInstanceOf[js.Any])
    
    inline def setLiveTwoStepAnswer(
      value: Instantiable2[
          /* client */ ^, 
          /* sequence */ js.Array[Double], 
          typings.kahootJsUpdated.liveTwoStepAnswerMod.^
        ]
    ): Self = StObject.set(x, "LiveTwoStepAnswer", value.asInstanceOf[js.Any])
  }
}
