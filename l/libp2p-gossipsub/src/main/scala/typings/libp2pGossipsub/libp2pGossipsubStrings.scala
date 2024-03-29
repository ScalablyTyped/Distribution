package typings.libp2pGossipsub

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libp2pGossipsubStrings {
  
  @js.native
  sealed trait `Linefeedmessage RPC LeftcurlybracketLinefeed  repeated SubOpts subscriptions Equalssign 1SemicolonLinefeed  repeated Message msgs Equalssign 2SemicolonLinefeed  optional ControlMessage control Equalssign 3SemicolonLinefeedLinefeed  message SubOpts LeftcurlybracketLinefeed    optional bool subscribe Equalssign 1Semicolon SlashSlash subscribe or unsubcribeLinefeed    optional string topicID Equalssign 2SemicolonLinefeed  RightcurlybracketLinefeedLinefeed  message Message LeftcurlybracketLinefeed  ` extends StObject
  inline def `Linefeedmessage RPC LeftcurlybracketLinefeed  repeated SubOpts subscriptions Equalssign 1SemicolonLinefeed  repeated Message msgs Equalssign 2SemicolonLinefeed  optional ControlMessage control Equalssign 3SemicolonLinefeedLinefeed  message SubOpts LeftcurlybracketLinefeed    optional bool subscribe Equalssign 1Semicolon SlashSlash subscribe or unsubcribeLinefeed    optional string topicID Equalssign 2SemicolonLinefeed  RightcurlybracketLinefeedLinefeed  message Message LeftcurlybracketLinefeed  `: `Linefeedmessage RPC LeftcurlybracketLinefeed  repeated SubOpts subscriptions Equalssign 1SemicolonLinefeed  repeated Message msgs Equalssign 2SemicolonLinefeed  optional ControlMessage control Equalssign 3SemicolonLinefeedLinefeed  message SubOpts LeftcurlybracketLinefeed    optional bool subscribe Equalssign 1Semicolon SlashSlash subscribe or unsubcribeLinefeed    optional string topicID Equalssign 2SemicolonLinefeed  RightcurlybracketLinefeedLinefeed  message Message LeftcurlybracketLinefeed  ` = ("\nmessage RPC {\n  repeated SubOpts subscriptions = 1;\n  repeated Message msgs = 2;\n  optional ControlMessage control = 3;\n\n  message SubOpts {\n    optional bool subscribe = 1; // subscribe or unsubcribe\n    optional string topicID = 2;\n  }\n\n  message Message {\n    optional bytes from = 1;\n    optional bytes data = 2;\n    optional bytes seqno = 3;\n    repeated string topicIDs = 4; \n    optional bytes signature = 5;\n    optional bytes key = 6;\n  }\n\n  message ControlMessage {\n    repeated ControlIHave ihave = 1;\n    repeated ControlIWant iwant = 2;\n    repeated ControlGraft graft = 3;\n    repeated ControlPrune prune = 4;\n  }\n\n  message ControlIHave {\n    optional string topicID = 1;\n    repeated bytes messageIDs = 2;\n  }\n\n  message ControlIWant {\n    repeated bytes messageIDs = 1;  \n  }\n\n  message ControlGraft {\n    optional string topicID = 1;\n  }\n\n  message ControlPrune {\n    optional string topicID = 1;\n    repeated PeerInfo peers = 2;\n    optional uint64 backoff = 3;\n  }\n\n  message PeerInfo {\n    optional bytes peerID = 1;\n    optional bytes signedPeerRecord = 2;\n  }\n}").asInstanceOf[`Linefeedmessage RPC LeftcurlybracketLinefeed  repeated SubOpts subscriptions Equalssign 1SemicolonLinefeed  repeated Message msgs Equalssign 2SemicolonLinefeed  optional ControlMessage control Equalssign 3SemicolonLinefeedLinefeed  message SubOpts LeftcurlybracketLinefeed    optional bool subscribe Equalssign 1Semicolon SlashSlash subscribe or unsubcribeLinefeed    optional string topicID Equalssign 2SemicolonLinefeed  RightcurlybracketLinefeedLinefeed  message Message LeftcurlybracketLinefeed  `]
  
  @js.native
  sealed trait inbound extends StObject
  inline def inbound: inbound = "inbound".asInstanceOf[inbound]
  
  @js.native
  sealed trait outbound extends StObject
  inline def outbound: outbound = "outbound".asInstanceOf[outbound]
}
