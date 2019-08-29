organization := "org.scalablytyped"
name := "guardian__prosemirror-invisibles"
version := "1.2-dt-20190213Z-a62adc"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "orderedmap" % "1.0-dt-20180214Z-ba8c18",
  "org.scalablytyped" %%% "prosemirror-model" % "1.7-dt-20190628Z-4319e2",
  "org.scalablytyped" %%% "prosemirror-state" % "1.2-dt-20190222Z-126b75",
  "org.scalablytyped" %%% "prosemirror-transform" % "1.1-dt-20180621Z-209cf1",
  "org.scalablytyped" %%% "prosemirror-view" % "1.9-dt-20190715Z-741642",
  "org.scalablytyped" %%% "std" % "3.6-c16502")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        