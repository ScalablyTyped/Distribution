organization := "org.scalablytyped"
name := "javascript-obfuscator"
version := "0.18.4-d03f42"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "chance" % "1.0-dt-20191003Z-9f4d40",
  "org.scalablytyped" %%% "estraverse" % "0.0-unknown-dt-20190322Z-461379",
  "org.scalablytyped" %%% "estree" % "0.0-unknown-dt-20191119Z-f37823",
  "org.scalablytyped" %%% "inversify" % "5.0.1-4dfaa6",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191126Z-959704",
  "org.scalablytyped" %%% "std" % "3.7-1d724d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        