organization := "org.scalablytyped"
name := "material-ui__core"
version := "3.9.3-a744aa"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "cheerio" % "v0.22.0-dt-20200129Z-073bb2",
  "org.scalablytyped" %%% "csstype" % "2.6.6-ffacbb",
  "org.scalablytyped" %%% "enzyme" % "3.10-dt-20200207Z-d7ed69",
  "org.scalablytyped" %%% "jss" % "10.0.4-f0ad60",
  "org.scalablytyped" %%% "node" % "13.7-dt-20200211Z-d6af7e",
  "org.scalablytyped" %%% "popper_dot_js" % "1.16.1-07f87f",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190924Z-05a52c",
  "org.scalablytyped" %%% "react" % "16.9-dt-20200122Z-b17eee",
  "org.scalablytyped" %%% "react-transition-group" % "4.2-dt-20191126Z-855e30",
  "org.scalablytyped" %%% "std" % "3.7-1b8369")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
