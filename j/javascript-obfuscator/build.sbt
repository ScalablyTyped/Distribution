organization := "org.scalablytyped"
name := "javascript-obfuscator"
version := "0.18.8-922693"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "chance" % "1.0-dt-20191223Z-3fb943",
  "org.scalablytyped" %%% "estraverse" % "0.0-unknown-dt-20190322Z-66caae",
  "org.scalablytyped" %%% "estree" % "0.0-unknown-dt-20200108Z-f39507",
  "org.scalablytyped" %%% "inversify" % "5.0.1-c253da",
  "org.scalablytyped" %%% "node" % "13.7-dt-20200211Z-d6af7e",
  "org.scalablytyped" %%% "std" % "3.7-1b8369")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
