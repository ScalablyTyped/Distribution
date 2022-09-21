package typings.haxballHeadlessBrowser

import typings.haxballHeadlessBrowser.anon.PartialDiscPropertiesObje
import typings.haxballHeadlessBrowser.anon.X
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RoomObject extends StObject {
  
  var CollisionFlags: CollisionFlagsObject = js.native
  
  def clearBan(playerId: Double): Unit = js.native
  
  def clearBans(): Unit = js.native
  
  def getBallPosition(): X = js.native
  
  def getDiscCount(): Double = js.native
  
  def getDiscProperties(discIndex: Double): DiscPropertiesObject = js.native
  
  def getPlayer(playerId: Double): PlayerObject = js.native
  
  def getPlayerDiscProperties(playerId: Double): DiscPropertiesObject = js.native
  
  def getPlayerList(): js.Array[PlayerObject] = js.native
  
  def getScores(): ScoresObject = js.native
  
  def kickPlayer(playerId: Double, reason: String, ban: Boolean): Unit = js.native
  
  def onGamePause(byPlayer: PlayerObject): Unit = js.native
  
  def onGameStart(byPlayer: PlayerObject): Unit = js.native
  
  def onGameStop(byPlayer: PlayerObject): Unit = js.native
  
  def onGameTick(): Unit = js.native
  
  def onGameUnpause(byPlayer: PlayerObject): Unit = js.native
  
  def onKickRateLimitSet(min: Double, rate: Double, burst: Double, byPlayer: PlayerObject): Unit = js.native
  
  def onPlayerActivity(player: PlayerObject): Unit = js.native
  
  def onPlayerAdminChange(changedPlayer: PlayerObject, byPlayer: PlayerObject): Unit = js.native
  
  def onPlayerBallKick(player: PlayerObject): Unit = js.native
  
  def onPlayerChat(player: PlayerObject, msg: String): Boolean = js.native
  
  def onPlayerJoin(player: PlayerObject): Unit = js.native
  
  def onPlayerKicked(kickedPlayer: PlayerObject, reason: String, ban: Boolean, byPlayer: PlayerObject): Unit = js.native
  
  def onPlayerLeave(player: PlayerObject): Unit = js.native
  
  def onPlayerTeamChange(changedPlayer: PlayerObject, byPlayer: PlayerObject): Unit = js.native
  
  def onPositionsReset(): Unit = js.native
  
  def onRoomLink(url: String): Unit = js.native
  
  def onStadiumChange(newStadiumName: String, byPlayer: PlayerObject): Unit = js.native
  
  def onTeamGoal(team: TeamID): Unit = js.native
  
  def onTeamVictory(scores: ScoresObject): Unit = js.native
  
  def pauseGame(pauseState: Boolean): Unit = js.native
  
  def reorderPlayers(playerIdList: js.Array[Double], moveToTop: Boolean): Unit = js.native
  
  def sendAnnouncement(msg: String): Unit = js.native
  def sendAnnouncement(msg: String, targetId: Double): Unit = js.native
  def sendAnnouncement(msg: String, targetId: Double, color: Double): Unit = js.native
  def sendAnnouncement(msg: String, targetId: Double, color: Double, style: String): Unit = js.native
  def sendAnnouncement(msg: String, targetId: Double, color: Double, style: String, sound: Double): Unit = js.native
  def sendAnnouncement(msg: String, targetId: Double, color: Double, style: Unit, sound: Double): Unit = js.native
  def sendAnnouncement(msg: String, targetId: Double, color: Unit, style: String): Unit = js.native
  def sendAnnouncement(msg: String, targetId: Double, color: Unit, style: String, sound: Double): Unit = js.native
  def sendAnnouncement(msg: String, targetId: Double, color: Unit, style: Unit, sound: Double): Unit = js.native
  def sendAnnouncement(msg: String, targetId: Unit, color: Double): Unit = js.native
  def sendAnnouncement(msg: String, targetId: Unit, color: Double, style: String): Unit = js.native
  def sendAnnouncement(msg: String, targetId: Unit, color: Double, style: String, sound: Double): Unit = js.native
  def sendAnnouncement(msg: String, targetId: Unit, color: Double, style: Unit, sound: Double): Unit = js.native
  def sendAnnouncement(msg: String, targetId: Unit, color: Unit, style: String): Unit = js.native
  def sendAnnouncement(msg: String, targetId: Unit, color: Unit, style: String, sound: Double): Unit = js.native
  def sendAnnouncement(msg: String, targetId: Unit, color: Unit, style: Unit, sound: Double): Unit = js.native
  
  def sendChat(msg: String, targetId: Double): Unit = js.native
  
  def setCustomStadium(stadiumFileContents: String): Unit = js.native
  
  def setDefaultStadium(stadiumName: String): Unit = js.native
  
  def setDiscProperties(discIndex: Double, properties: PartialDiscPropertiesObje): Unit = js.native
  
  def setKickRateLimit(min: Double, rate: Double, burst: Double): Unit = js.native
  
  def setPassword(pass: String): Unit = js.native
  
  def setPlayerAdmin(playerId: Double, admin: Boolean): Unit = js.native
  
  def setPlayerAvatar(playerId: Double, avatar: String): Unit = js.native
  
  def setPlayerDiscProperties(playerId: Double, properties: PartialDiscPropertiesObje): Unit = js.native
  
  def setPlayerTeam(playerId: Double, team: Double): Unit = js.native
  
  def setRequireCaptcha(required: Boolean): Unit = js.native
  
  def setScoreLimit(limit: Double): Unit = js.native
  
  def setTeamColors(team: TeamID, angle: Double, textColor: Double, colors: js.Array[Double]): Unit = js.native
  
  def setTeamsLock(locked: Boolean): Unit = js.native
  
  def setTimeLimit(limitInMinutes: Double): Unit = js.native
  
  def startGame(): Unit = js.native
  
  def startRecording(): Unit = js.native
  
  def stopGame(): Unit = js.native
  
  def stopRecording(): js.typedarray.Uint8Array = js.native
}
